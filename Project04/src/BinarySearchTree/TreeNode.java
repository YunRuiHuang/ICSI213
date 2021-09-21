package BinarySearchTree;
/**
 * 
 * @author yunrui Huang
 *
 * @param <E>
 */
public class TreeNode<E> {

	private E element;
	private TreeNode<E> left;
	private TreeNode<E> right;
	
	TreeNode(){
		this(null,null,null);
	}
	TreeNode(E element){
		this(element,null,null);
	}
	TreeNode(E element, TreeNode<E> left, TreeNode<E> right){
		this.element = element;
		this.right = right;
		this.left = left;
	}
	/**
	 * return the element
	 * @return the value of element
	 */
	public E getElement() {
		return this.element;
	}
	/**
	 * set the element
	 * @param element the element use to change
	 */
	public void setElement(E element) {
		this.element = element;
	}
	/**
	 * return the right node
	 * @return the right node
	 */
	public TreeNode<E> getRight(){
		return this.right;
	}
	/**
	 * set the right node
	 * @param right the right node use to change
	 */
	public void setRight(TreeNode<E> right) {
		this.right = right;
	}
	/**
	 * return the left node
	 * @return the left node
	 */
	public TreeNode<E> getLeft(){
		return this.left;
	}
	/**
	 * set the left node
	 * @param left the left node use to change
	 */
	public void setLeft(TreeNode<E> left) {
		this.left = left;
	}
}
