
import java.io.FileNotFoundException;
/**
 * Demonstrates the use of array-based ADT list.
 * @author Qi Wang
 * @version 1.0
 */
public class Driver {
 /**
  * Tests the array-based ADT list.
  * @param args A reference to a string array that can store command-line arguments
  * @throws ListException If size() == 0
  * @throws ListIndexOutOfBoundsException If index < 0 or index > size()
  * @throws FileNotFoundException if a file is not found
  */
 public static void main(String[] args) throws FileNotFoundException, ListIndexOutOfBoundsException, ListException{
  Utility.start();
 }
}