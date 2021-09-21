package ADT;
/**
 * @author Yunrui Huang
 * @version 1.0
 */
public class Node {
	private Object item;
	private Node next;
	private Node previous;
	
	/**
	  * Constructs a default node.
	  */
	public Node() {
		this(null,null,null);
	}
	
	/**
	  * Constructs a node with the input of element
	  * @param item A reference to the element of this node
	  */
	public Node(Object item) {
		this(item,null,null);
	}
	
	/**
	 * Constructs a node with the input of element, next and previous
	 * @param item A reference to the element of this node
	 * @param next the next element of this node
	 * @param previous the previous element of this node
	 */
	public Node(Object item, Node next, Node previous) {
		this.item = item;
		this.next = next;
		this.previous = previous;
	}
	
	/**
	 * Returns the element of this node.
	 * @return The element of this node
	 */
	public Object getElement() {
		
		return item;
	}
	
	/**
	 * set the element of this node
	 * @param item the reference to the element
	 */
	public void setElement(Object item) {
		this.item = item;
		
	}
	
	/**
	 * Returns the next element of this node.
	 * @return The next element of this node
	 */
	public Node getNext() {
		
		return this.next;
	}
	
	/**
	 * set the next element of this node
	 * @param item the reference to the next element
	 */
	public void setNext(Node item) {
		this.next = item;
	}
	
	/**
	 * Returns the previous element of this node.
	 * @return The previous element of this node
	 */
	public Node getPrevious() {
		return previous;
	}
	
	/**
	 * set the previous element of this node
	 * @param item the reference to the previous element
	 */
	public void setPrevious(Node item) {
		this.previous = item;
	}
	/**
	 * overload the toString method
	 */
	public String toString() {
		return "is : " + this.item;
	}

}
