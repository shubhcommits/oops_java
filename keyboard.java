import java.util.Scanner;

public class keyboard {
  public static void main(String arg[]){
    Scanner s=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter the value of a,b and c");
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    int x=a+b+c;
    System.out.println(x);
    s.close();
  }
}
