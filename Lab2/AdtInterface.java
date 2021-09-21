package ADT;
/* Lab2
 * Yunrui Huang
 * 2/3/2019
 * ICSI 213
 */
public interface AdtInterface {
 public final int Max_Item = 50;

 public void remooveLast();
 
 public void removeRandom();
 
 public int get(Object item); 
 
 public Object get(int index);
 
 public int size();
 
 public boolean inFull();
 
 public boolean isEmpty();
 
 public void makeEmpty();
 
}
