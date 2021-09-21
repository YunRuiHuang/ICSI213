package BinarySearchTree;
/**
 * 
 * @author yunrui Huang
 *
 * @param <E>
 */
public class TreeIterator<E> {

	private BinaryTreeBasis<E> tree;
	private LinkedList<TreeNode<E>> queue;
	
	public TreeIterator(BinaryTreeBasis<E> tree) {
		this.tree = tree;
		this.queue = new LinkedList<TreeNode<T>>();
	}

	
	public E next() throws java.util.NoSuchElementException {
		return this.queue.remove().getElement();
	}
	public boolean hasNext() {
		return !this.queue.isEmpty();
	}
	public void setPreorder() {
		this.queue.clear();
		this.preorder(this.tree.root);
	}
	public void setInorder() {
		this.queue.clear();
		this.inorder(this.tree.root);
	}
	public void setPostorder() {
		this.queue.clear();
		this.postorder(this.tree.root);
	  }
	
	private void preorder(TreeNode<E> treeNode) {
	    if(treeNode != null){
	    	this.queue.add(treeNode);
	    	preorder(treeNode.getLeft());
	    	preorder(treeNode.getRight());
	    	
	    }
	  }


	  private void inorder(TreeNode<E> treeNode) {
		  if(treeNode != null){
		    	inorder(treeNode.getLeft());
		    	this.queue.add(treeNode);
		    	inorder(treeNode.getRight());
		    	
		    }
	  }


	  private void postorder(TreeNode<E> treeNode) {
		  if(treeNode != null){
			    postorder(treeNode.getLeft());
		    	postorder(treeNode.getRight());
		    	this.queue.add(treeNode);
		    	
		    }
	
}

