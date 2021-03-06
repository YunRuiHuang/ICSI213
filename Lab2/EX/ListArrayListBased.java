
import java.util.ArrayList;

/**
 * Implementations of operations of an ADT list.
 * @author Qi Wang
 * @version 1.0
 *
 */
public class ListArrayListBased implements ListInterface{
 /**
  * A reference to an array of data
  */
 private ArrayList<Object> data;

 /**
  * Creates an empty ADT list.
  */
 public ListArrayListBased(){
  this.data = new ArrayList<Object>();
 }
  /**
   * Determines whether a list is empty. 
   * @return A boolean value specifying if this list is empty or not
   */
   public boolean isEmpty(){
    return this.data.size() == 0;
   }
   
   /**
    * Returns the length of a list. 
    * @return An integer specifying the length of a list
    */
   public int size(){
    return this.data.size();
   }
   
   /**
    * Adds a data to the list at position index.
    * @param index The position of this added data
    * @param data A reference to this added data
    * @throws ListIndexOutOfBoundsException If index < 0 or index > size()
    */
   public void add(int index, Object data) throws ListIndexOutOfBoundsException{
    if(index < 0 || index > this.size()){
     throw new ListIndexOutOfBoundsException("The index value must be between 0 and " + (this.data.size()-1));
    }else{
     // add to the specific position. 
     this.data.add(index, data);
    }
   }
   
   /**
    * Removes a data by position.
    * @param index An integer specifying the position of the removed data
    * @throws ListIndexOutOfBoundsException If index < 0 or index > size()
    * @throws ListException If size() is 0
    */
   public void remove(int index)  throws ListIndexOutOfBoundsException, ListException{
    if(this.size() == 0){
     throw new ListException("The list is empty, and no elements can be removed.");
    }else if(index < 0 || index > this.size()){
     throw new ListIndexOutOfBoundsException("The index value must be between 0 and " + (this.data.size()-1));
    }else{
     this.data.remove(index);
    }
   }
   
   /**
    * Removes all items in a list.
    */
   public void removeAll(){
    this.data.removeAll(this.data) ;
    //this.data = new ArrayList<Object>();
    //this.data.clear();
   }
   
   /**
    * Returns a data by position.
    * @param index An integer specifying the position of the data
    * @return An object specifying the retrieved data 
    * @throws ListIndexOutOfBoundsException If index < 0 or index > size()
    * @throws ListException If size() is 0
    */
   public Object get(int index) throws ListIndexOutOfBoundsException, ListException{
    if(this.size() == 0){
     throw new ListException("The list is empty, and no elements can be removed.");
    }else if(index < 0 || index > this.size()){
     throw new ListIndexOutOfBoundsException("The index value must be between 0 and " + (this.data.size()-1));
    }else{
     // return an items at index from this list.
     return this.data.get(index);
    }
    
   }
 
}



