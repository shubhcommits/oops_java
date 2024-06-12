import java.util.Scanner;

public class _10user_name_pass {
  public static void main(String[] args) {
    String name="Shubham";
    String password="22222";
    System.out.println("Enter the name ans password");
    int c=0;
    while(true){
      Scanner s=new Scanner(System.in);
      String nameE;
      String passwordE;
      nameE=s.next();
      passwordE=s.next();
      if(nameE.equals(name)&&passwordE.equals(password)){
        System.out.println("welcome");
        s.close();
        break;
      }
      else{
        c++;
        if(c==3){
          s.close();
          System.out.println("all attempt fails");
          System.out.println("name or password is wrong");
        }
      }
    }
  }
}
