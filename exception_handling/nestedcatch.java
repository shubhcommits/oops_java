public class nestedcatch {
  public static void main(String[] args) {
    int A[]={30,10,20,40,0};
    try{
      int c=A[0]/A[4];
      System.out.println(c);
      try{
        System.out.println(A[5]);
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Invalid index");
      }
    }
    catch(ArithmeticException e){
      System.out.println(e);
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }
    System.out.println("Program ended");
  }
}
