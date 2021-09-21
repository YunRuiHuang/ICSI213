package abstractDataType;

/**
 * Specifications on the design of operations of an ADT list.
 * @author Yunrui Huang
 * @version 1.0
 */

public interface ADTInterface {
	
	/** 
	 * Add the data in to the end of list 
	 * @param item The reference for add in the list
	 * @throws ADTIndexOutOfBoundsException If item more than 50
	 */
	 public void insert(Object item) throws ADTIndexOutOfBoundsException;
	 
	 /**
	  * Remove the last data at the list
	  * @throws ListException If size() is 0
	  */
	 public void removeLast() throws ListException;
	 
	 /**
	  * Remove a random data from the list
	  * @throws ListException If size() is 0
	  */
	 public void removeRandom() throws ListException;
	 
	 /**
	  * Find the index for a item
	  * @param item The reference ready to find
	  * @return the index of this reference
	  * @throws ListException If size() is 0
	  */
	 public int get(Object item) throws ListException; 
	 
	 /**
	  * Find the item by the index
	  * @param index the index of item 
	  * @return the item of this index
	  * @throws ListException If size() is 0
	  * @throws ADTIndexOutOfBoundsException If index > size()
	  */
	 public Object get(int index) throws ListException, ADTIndexOutOfBoundsException;
	 
	 /**
	  * Find out the size of list
	  * @return the number of item of list
	  */
	 public int size();
	 
	 /**
	  * Find out if the list is full
	  * @return A boolean value specifying if this list is full or not
	  */
	 public boolean isFull();
	 
	 /**
	  * Find out if the list is empty
	  * @return A boolean value specifying if this list is empty or not
	  */
	 public boolean isEmpty();
	 
	 /**
	  * Make the list empty
	  */
	 public void makeEmpty();
	 
}
