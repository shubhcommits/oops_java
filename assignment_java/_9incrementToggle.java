import java.util.*;
// import java.util.Scanner;  // this includes scanner

public class _9incrementToggle {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String input=s.next();
    String output=incremented_toggled(input);
    s.close();
    System.out.println("Original string was "+input);
    System.out.println("New string is "+output);
  }
  public static String incremented_toggled(String input){
    StringBuilder sb=new StringBuilder();
    for(char ch:input.toCharArray()){
      char newString=(char)(ch+1);
      if(Character.isUpperCase(newString)){
        newString=Character.toLowerCase(newString);
      }
      else{
        newString=Character.toUpperCase(newString);
      }
      sb.append(newString);
    }
    return sb.toString();
  }
}
