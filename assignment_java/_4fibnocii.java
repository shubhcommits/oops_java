import java.util.Scanner;

public class _4fibnocii {
  public static void fib(int n){
    int a=0,b=1;
    if(n>=1)
    System.out.println(a);
    if(n>=2)
    System.out.println(b);
    int i=3;
    while(i<=n){
      // System.out.println(b);
      int num=a+b;
      a=b;
      b=num;
      System.out.println(num);
      i++;
    }
  }
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    s.close();
    fib(n);
  }
}
