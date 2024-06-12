import java.util.*;
public class _5calci {
  public static void main(String[] arg){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the two numbers");
    int a=s.nextInt();
    int b=s.nextInt();
    System.out.println("Enter the operation to be performed");
    String input=s.next();
    char ch=input.charAt(0);
    s.close();
    if(ch=='+'){
      System.out.println(a+b);
    }
    else if(ch=='-'){
      System.out.println(a-b);
    }
    else if(ch=='*'){
      System.out.println(a*b);
    }
    else if(ch=='/'){
      if(b!=0){
        System.out.println(a/b);
      }
      else System.out.println("Invalid number");
    }
    else System.out.println("Invalid operation entered");
  }
}
