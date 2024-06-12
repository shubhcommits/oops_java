import java.util.*;
public class _8count_char_special {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the String");
    String input=s.next();
    int digit_count=0;
    int char_count=0;
    int special_count=0;
    s.close();
    for(int i=0;i<input.length();i++){
      char ch=input.charAt(i);
      if(Character.isDigit(ch)) digit_count++;
      else if(Character.isLetter(ch)) char_count++;
      else special_count++;
    }
    System.out.println("Total no are digits are : "+digit_count);
    System.out.println("Total no are character are : "+char_count);
    System.out.println("Total no are special sharracter are : "+special_count);
  }
}
