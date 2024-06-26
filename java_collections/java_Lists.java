import java.util.*;
public class java_Lists {
  public static void main(String[] args){
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i=0;i<10;i++){
      arr.add(i+10);
    }
    arr.add(0,94);
    for(int i=0;i<11;i++){
      System.out.println(arr.get(i));
    }
    arr.set(0,20);  // modifying an element in ArrayList
    arr.remove(0); // removing first element
    System.out.println("\n");
    for(int i:arr){
      System.out.println(i);
    }
    System.out.println("\n");
    System.out.println(arr.size());
  }
}
