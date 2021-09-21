package ADT;

/**
 * Specifications on the design of operations of an ADT list.
 * @author Yunrui Huang
 * @version 1.0
 */

public interface ADTInterface {
	/**
	 * Find a char by the index
	 * @param index the index of char 
	 * @return the char of this index
	 */
	public char charAt(int index);
	/**
	 * link another LinkedString after the list
	 * @param links the LinkedString that input
	 * @return the new LinkedString
	 */
	public LinkedString concat(LinkedString links);
	/**
	 * Find out if the list is empty
     * @return A boolean value specifying if this list is empty or not
	 */
	public Boolean isEmpty();
	/**
	 * find out the length of list
	 * @return the length of list
	 */
	public int length();
	/**
	 * cut off the linkedString from index to index2
	 * @param index the start of new links
	 * @param index2 the end of new links
	 * @return the new LinkedString that cut off
	 */
	public LinkedString substring(int index,int index2);

}
