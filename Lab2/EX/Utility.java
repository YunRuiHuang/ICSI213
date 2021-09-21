

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Contains helper methods the array-based ADT list. 
 * @author Qi Wang
 * @version 1.0
 */
public class Utility {
 /**
  * Demonstrates and tests the array-based ADT list.
  * @throws ListException If size() == 0
  * @throws ListIndexOutOfBoundsException If index < 0 or index > size()
  * @throws FileNotFoundException if a file is not found
  */
 public static void start() throws FileNotFoundException, ListIndexOutOfBoundsException, ListException{
  ListArrayListBased list = new ListArrayListBased();
    //Create a list
  fillList(list);

    //Display a list
  displayList(list);
 
  /*//Remove first data
  list.remove(0);
  displayList(list);
  
  //Remove all of the data
  list.removeAll();
  displayList(list);*/
 }
 
 /**
  * Creates a list of charges.
  * @param list A reference to a list of data
  */
 private static void fillList(ListArrayListBased list) throws FileNotFoundException{
  Scanner input = new Scanner(new File("datalist.txt"));
  //$4.50 $23.56 $2000.98 $0.34
  int i = 0;
  while(input.hasNext()){
   list.add(i,input.next()); 
   i++;
     }
  input.close();
 }
 
 /**
  * Displays data in order. 
  * @param list A reference to a list of data
  * @throws ListException if size() == 0
  * @throws ListIndexOutOfBoundsException If index < 0 or index > size()
  */
 private static void displayList(ListArrayListBased list) throws ListIndexOutOfBoundsException, ListException{
    for(int i = 0; i < list.size(); i++){
     System.out.println(list.get(i));
    }
 }

}
