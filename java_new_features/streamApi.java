import java.util.*;
public class streamApi {
  public static void main(String[] args) {
    List<Integer> nums=Arrays.asList(5,6,3,4,7,11);
    // an stream once created can be used only once
    nums.stream()
    .filter(n->n%2==1)  // this itself created an stream
    .map(n->n*2)  // this itself created an stream
    .forEach(n->System.out.println(n));
  }
}
