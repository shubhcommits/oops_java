import java.util.Scanner;

public class _6factorial {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of which you want to get the factorial");
    int a;
    a=s.nextInt();
    s.close();
    int res=1;
    for(int i=a;i>=2;i--){
      res=res*i;
    }
    System.out.println(res);
  }
}