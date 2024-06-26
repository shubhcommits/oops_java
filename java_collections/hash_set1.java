import java.util.*;
public class hash_set1 {
  public static void main(String[] args) {
    HashSet<Integer> st=new HashSet<Integer>();  // it  stores unique values
    st.add(52);
    st.add(52);
    st.add(1);
    st.add(2);

    st.remove(2);  // removed 1 from set
    
    for(Integer it:st){
      System.out.println(it);
    }
    System.out.println(st.contains(52));
  }
}
