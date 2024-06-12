import java.util.*;
public class _7contains {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter first and second number");
    int a,b;
    a=s.nextInt();
    b=s.nextInt();
    String strA=Integer.toString(a);
    String strB=Integer.toString(b);
    if(strA.contains(strB)){
      System.out.println("a contains b");
    }
    else System.out.println("a does not contains b");
  }
}
