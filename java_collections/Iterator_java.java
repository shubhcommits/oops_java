import java.util.*;

public class Iterator_java {
  public static void main(String[] args) {
    ArrayList<Integer> arr=new ArrayList<>();
    arr.add(5);
    arr.add(2);
    arr.add(3);
    arr.add(4);
    arr.remove(3); // removing at an index 3  
    Iterator<Integer> it=arr.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}
