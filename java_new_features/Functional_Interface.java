@FunctionalInterface
interface A{
  void show();
}
// class B implements A{
//   public void show(){
//     System.out.println("Hello");
//   }
// }
public class Functional_Interface {
  public static void main(String[] args) {
    /*
    // Ananomoyous inner class
    A obj=new A(){
      public void show(){
        System.out.println("Hello");
      }
    };
    */

    // converting above snippet into lamda expression

    A obj=()->{  // as there in only one method in functional interface so we can implement this 
      System.out.println("Hello");
    };
  obj.show();
  }
}
