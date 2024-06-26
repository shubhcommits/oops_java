import java.util.*;
public class HashMap1 {
  public static void main(String[] args) {
    HashMap<Integer,Integer> mp= new HashMap<Integer,Integer>();
    mp.put(0,1);
    mp.put(0,2);
    mp.put(2,1);
    mp.put(3,3);
    mp.put(4,4);
    System.out.println(mp);
    System.out.println(mp.get(0));
    System.out.println(mp.size());

    System.out.println("");
    
    // looping in loop accessing keys
    for(Integer it:mp.keySet()){  // by .keySet accessing keys of map
      System.out.println(it);
    }
    System.out.println("");
    // looping in map accessing values
    for(Integer it:mp.values()){  // accessing values of the map
      System.out.println(it);
    }
  }
}
