import java.util.Scanner;

public class _3quadratic {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);

    // these are the ways of taking input character in java

    // char a=s.next().charAt(0);
    // char b=s.next().charAt(0);
    // char c=s.next().charAt(0);
    // s.close();

    double a=s.nextDouble();
    double b=s.nextDouble();
    double c=s.nextDouble();
    System.out.println();
    s.close();

    double discriminant=b*b-4*a*c;
    if(discriminant==0){
      double root=-b/(2*a);
      System.out.println("The roots are same : "+ root);
    }
    else if(discriminant>0){
      double root1=(-b+Math.sqrt(discriminant))/(2*a);
      double root2=(-b+Math.sqrt(discriminant))/(2*a);
      System.out.println("Roots are real and they are  : "+root1+" and "+root2);
    }
    else{
      double realPart=-b/(2*a);
      double imagPart=Math.sqrt(-discriminant)/(2*a);
      System.out.println("root 1 is "+realPart+"+"+imagPart+"i");
      System.out.println("root 1 is "+realPart+"-"+imagPart+"i");
    }
  }
}
