package BinarySearchTree;
/**
 * 
 * @author yunrui Huang
 *
 * @param <E>
 */
public class BinaryTreeBasis<E> {

	 protected TreeNode<E> root;
	 
	 public BinaryTreeBasis() {
		 this(null);
	 }
	 public BinaryTreeBasis(E rootItem) {
	     this.root = new TreeNode<E>(rootItem, null, null);
	  } 
	 /**
	  * check if empty
	  * @return empty or not
	  */
	 public boolean isEmpty() {
		 return this.root==null;
	 }
	 /**
	  * empty the root
	  */
	 public void makeEmpty() {
		 this.root=null;
	 }
	 /**
	  * check the root element
	  * @return the root element
	  * @throws TreeException
	  */
	 public E getRoot() throws TreeException {
		 if (this.root == null) {
			 throw new TreeException("TreeException: Empty tree");
		 }else {
			 return this.root.getElement();
		 }
	 }
	 /**
	  * set the root element
	  * @param element use for chenge the root
	  * @throws UnsupportedOperationException
	  */
	 public void setRoot(E element)throws UnsupportedOperationException{
		 if (element == null) {
			 throw new UnsupportedOperationException("unsuport");
		 }else {
			 this.root.setElement(element);
		 }
	 }
	
}
