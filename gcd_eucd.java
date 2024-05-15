import java.util.Scanner;

public class gcd_eucd {
  // can give same name to multiple methods
  // differend methods are called on the basis of parameter
  // we can have different methods with same name condition no of parameters to be different or datatype should be different
  static int find(int a,int b){
    while(b%a!=0){
      int res=b%a;
      b=a;
      a=res;
    }
    return a;
  }
  public static void main(String arg[]){
    Scanner s=new Scanner(System.in);
    int a,b;
    System.out.println("Enter two number ");
    a=s.nextInt();
    b=s.nextInt();
    s.close();
    int ans=find(a,b);
    System.out.println(ans);
  }
}
