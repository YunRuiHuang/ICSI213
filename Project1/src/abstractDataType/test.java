package abstractDataType;

import java.io.FileNotFoundException;
/**
 * The driver for this list
 * @author Yunrui Huang
 * @version 1.0
 *
 */
public class test {

	/**
	 * Tests the ADT list.
	 * @param args A reference to a string array that can store command-line arguments
	 * @throws ADTIndexOutOfBoundsException If index > size()
	 * @throws ListException If size() is 0
	 * @throws FileNotFoundException if a file is not found
	 */
 public static void main(String[] args) throws ADTIndexOutOfBoundsException, ListException, FileNotFoundException{
   ADTUtility.start();
 }
}
