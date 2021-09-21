package abstractDataType;
import java.util.*;

/**
 * Implementations of operations of an ADT list.
 * @author Yunrui Huang
 * @version 1.0
 */
public class ArraylistBased implements ADTInterface{
	/**
	  * A reference to an array of data
	  */
	private Object[] list;
	
	/**
	  * The size of the list has
	  */
	private int listNum;
	
	/**
	 * Creates an empty ADT list can hold max 50 item
	 */
	public ArraylistBased() {
		this.list = new Object[50];
		listNum = 0;
	}
	
	/** 
	 * Add the data in to the end of list 
	 * @param item The reference for add in the list
	 * @throws ADTIndexOutOfBoundsException If item more than 50
	 */
	public void insert(Object item) throws ADTIndexOutOfBoundsException{
		if(listNum == 50) {
			throw new ADTIndexOutOfBoundsException("The bag is full");
		}else {
			this.list[listNum] = item;
			listNum++;
		}
	}

	/**
	 * Remove the last data at the list
	 * @throws ListException If size() is 0
	 */
	public void removeLast() throws ListException {
		if(listNum == 0) {
			throw new ListException("The bag is empty");
		}else {
			this.list[listNum-1] = null;
			listNum--;
		}
	}
	 
	/**
	 * Remove a random data from the list
	 * @throws ListException If size() is 0
	 */
	public void removeRandom() throws ListException {
		if(listNum == 0) {
			throw new ListException("The bag is empty");
		}else {
			Random ran = new Random();
			int removeNum = ran.nextInt(listNum);
			for(;removeNum<listNum;removeNum++) {
				list[removeNum]=list[removeNum+1];
			}
			listNum--;
		}
		
	}
	 
	/**
	 * Find the index for a item
	 * @param item The reference ready to find
	 * @return the index of this reference
	 * @throws ListException If size() is 0
	 */
	public int get(Object item) throws ListException {
		if(listNum == 0) {
			throw new ListException("The bag is empty");
		}else {
			for(int i=0;i<listNum;i++) {
				if(list[i].equals(item)) {
					return i;
				}
			}
			System.out.println("We can't find that.");
			return -1;
		}
	}
	 
	/**
	 * Find the item by the index
	 * @param index the index of item 
	 * @return the item of this index
     * @throws ListException If size() is 0
  	 * @throws ADTIndexOutOfBoundsException If index > size()
	 */
	public Object get(int index) throws ListException, ADTIndexOutOfBoundsException {
		if(listNum == 0) {
			throw new ListException("The bag is empty");
		}else if(index < 0 || index >= listNum) {
			throw new ADTIndexOutOfBoundsException("The index must between 0 to " + (listNum-1));
		}else {
			return list[index];
		}

	}
	 
	/**
	 * Find out the size of list
	 * @return the number of item of list
	 */
	public int size() {
		 
		return listNum;
	}
	 
	/**
	 * Find out if the list is full
	 * @return A boolean value specifying if this list is full or not
	 */
	public boolean isFull() {
		 
		return listNum == 50;
	}
	 
	/**
	 * Find out if the list is empty
	 * @return A boolean value specifying if this list is empty or not
	 */
	public boolean isEmpty() {
		 
		return listNum == 0;
	}
	 
	/**
	 * Make the list empty
	 */
	public void makeEmpty() {
		this.list = new Object[50];
		listNum = 0;
	}

}
