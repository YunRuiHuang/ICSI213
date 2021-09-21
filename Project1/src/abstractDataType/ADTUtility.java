package abstractDataType;

import java.util.Scanner;
import java.io.*;

/**
 * Contains helper methods the ADT list. 
 * @author Yunrui Huang
 * @version 1.0
 */
public class ADTUtility {
	
	/**
	 * Creates a bag of items, and change items in the bag, and displays items.
	 * @throws ADTIndexOutOfBoundsException If index > size()
	 * @throws ListException If size() is 0
	 * @throws FileNotFoundException if a file is not found
	 */
	public static void start() throws ADTIndexOutOfBoundsException, ListException, FileNotFoundException {
		ArraylistBased list = new ArraylistBased();
		fillList(list);
		displayList(list);
	}
	
	/**
	 * Put the data from file in to list
	 * @param list the list that use
	 * @throws ADTIndexOutOfBoundsException If index > size()
	 * @throws ListException If size() is 0
	 * @throws FileNotFoundException if a file is not found
	 */
	private static void fillList(ArraylistBased list) throws ADTIndexOutOfBoundsException, ListException, FileNotFoundException{
		Scanner input = new Scanner(new File("datalist.txt"));
		while(input.hasNext()){
			list.insert(input.next()); 
		}
		  input.close();
	}
	
	/**
	 * print out the data in the list
	 * @param list the list that use
	 * @throws ADTIndexOutOfBoundsException If index > size()
	 * @throws ListException If size() is 0
	 * @throws FileNotFoundException if a file is not found
	 */
	private static void displayList(ArraylistBased list) throws ADTIndexOutOfBoundsException, ListException, FileNotFoundException{
		for(int i = 0; i < list.size(); i++){
		     System.out.println(list.get(i));
		    }
	}
	
}
