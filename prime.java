import java.util.Scanner;

public class prime {
  static boolean isPrime(int n){
    if(n<=1) return false;
    for(int i=2;i<n;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  public static void main(String arg[]){
    Scanner s=new Scanner(System.in);
    int n;
    System.out.println("Enter the number to be checked it is prime or not");
    n=s.nextInt();
    s.close();
    if(isPrime(n)) System.out.println("It is a prime number");
    else System.out.println("It is not a prime number");
  }
}
