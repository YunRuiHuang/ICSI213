package ADT;
/**
 * Specifications on the design of operations of an ADT list.
 * @author Yunrui Huang
 * @version 1.0
 */
public class LinkedString implements ADTInterface{
	
	private Node head;
	private int count;
	
	/**
	 * constructor with nothing input
	 */
	public LinkedString() {
		this.head = null;
		this.count = 0;
	}
	/**
	 * constructor put the char array into the list
	 * @param item the array of characters
	 */
	public LinkedString(char[] item) {
		Node temp;
		this.head = new Node(item[0]);
		this.count = 1;
		temp = this.head;
		for(int i=1; i< item.length;i++ ) {
			count++;
			temp.setNext(new Node(item[i]));
			temp = temp.getNext();
		}
	}
	/**
	 * constructor put the String into the list
	 * @param item the String that input
	 */
	public LinkedString(String item) {
		char[] atItem = item.toCharArray();
		Node temp = new Node();
		this.head = new Node(atItem[0]);
		temp = this.head;
		this.count = 1;
		for(int i=1; i< atItem.length;i++ ) {
			count++;
			temp.setNext(new Node(atItem[i]));
			temp = temp.getNext();
			
		}
	}

	/**
	 * Find a char by the index
	 * @param index the index of char 
	 * @return the char of this index
	 */
	public char charAt(int index) throws ADTIndexOutOfBoundsException {
		if(index < 0 || index > count) {
			     throw new ADTIndexOutOfBoundsException("The index value must be between 0 and " 
			                                 + (this.count -1));
			}
			else {
				Node temp = this.head;
				for(int i=0;i<index;i++) {
					temp = temp.getNext();
				}
				return ((Character) (temp.getElement())).charValue();
		}
	}

	/**
	 * link another LinkedString after the list
	 * @param links the LinkedString that input
	 * @return the new LinkedString
	 */
	public LinkedString concat(LinkedString links) {
		Node temp = this.head; 
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(links.head);
		LinkedString newLink = new LinkedString();
		newLink.head = temp;
		return newLink;
	}

	/**
	 * Find out if the list is empty
     * @return A boolean value specifying if this list is empty or not
	 */
	public Boolean isEmpty() {
		return count == 0;
	}
	
	/**
	 * find out the length of list
	 * @return the length of list
	 */
	public int length() {
		return count;
	}

	/**
	 * cut off the linkedString from index to index2
	 * @param index the start of new links
	 * @param index2 the end of new links
	 * @return the new LinkedString that cut off
	 */
	public LinkedString substring(int index,int index2) {
		Node temp = this.head;
		
		LinkedString newLink = new LinkedString();
		for(int i=0; i < index; i++) {
			temp = temp.getNext();
		}
		
		for(int i=0; i < (index2-index); i++) {
			temp = temp.getNext();
		}
		temp.setNext(null);
		for(int i=0; i < (index2-index); i++) {
			temp = temp.getPrevious();
		}
		newLink.head = temp;
		return newLink;
	}
	


}
