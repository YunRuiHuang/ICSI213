package BinarySearchTree;
/**
 * 
 * @author yunrui Huang
 *
 * @param <E>
 */
public interface ADTAddressBook<E> {
	public void insert(E element);
	public void delete(E element);
	public boolean search(E element);
	public E get(E element);
	public boolean isEmpty();
	public void removeAll();
}
