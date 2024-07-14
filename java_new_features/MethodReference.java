import java.util.*;

public class MethodReference {
public static void main(String[] args) {
  List<String> names=Arrays.asList("Aniket","Sachin","Rahul");
  names.forEach(s->System.out.println(s));  // this is using lamda expression
  System.out.println("\n");
  names.forEach(System.out::println);  // this is using method reference
}  
}
