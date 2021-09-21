package BinarySearchTree;
/**
 * 
 * @author yunrui Huang
 *
 */
public class AddressBook {

	private BinarySearchTree<E> tree;
	private int count;
	/**
	 * insert the new node
	 * @param element the new node for insert
	 */
	public void insert(E element) {
		count++;
		tree.insert(element);
	}
	/**
	 * delete a node from the tree
	 * @param element the node ready for delete
	 */
	public void delete(E element) {
		count--;
		tree.delete(element);
	}
	/**
	 * search the node from the tree
	 * @param element the node for search
	 * @return if has the node or not
	 */
	public boolean search(E element) {
		return tree.search.element;
	}
	/**
	 * get the full information of the node
	 * @param element the node use for search 
	 * @return the full information
	 */
	public E get(E element) {
		return tree.get(element);
	}
	/**
	 * check if empty
	 * @return
	 */
	public boolean isEmpty() {
		return count==0;
	}
	/**
	 * remove all the node
	 */
	public void removeAll() {
		
	}
}
