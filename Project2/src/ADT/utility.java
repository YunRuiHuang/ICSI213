package ADT;
/**
 * @author Yunrui Huang
 * @version 1.0
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class utility {
	/**  
	 * Creates a list of LinkedStringobjects and operates on them.   
	 * @throws FileNotFoundException 
	 */ 
	public static void start() throws FileNotFoundException{               
		ArrayList<LinkedString> list = new ArrayList<LinkedString>();
		Scanner input = new Scanner(new File("datalist.txt"));
		while(input.hasNext()) {
			list.add(new LinkedString(input.next()));
		}
		input.close();
		
		for(int i = 0; i < list.size(); i++){
			for(int a = 0; a < list.get(i).length(); a++){
		     System.out.print(list.get(i).charAt(a));
		    }
			System.out.println();
		}
		
	}

}
