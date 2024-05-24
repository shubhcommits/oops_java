// this is the java code for paramaterised constructor of java
class Parent{
  Parent(){
    System.out.println("NON-parameterise_constructor OF PARENT");
  }
  Parent(int x){
    System.out.println("parameterise_constructor OF PARENT");
  }
}
class Child extends Parent{
  Child(){
    System.out.println("NON_parameterise_constructor OF CHILD");
  }
  Child(int y){
    System.out.println("parameterise_constructor OF CHILD");
  }
  Child(int x,int y){
    super(x);  // calling parent constructor
    System.out.println("parameterise_constructor OF CHILD");
  }
}
public class parameterise_const {
  public static void main(String[] arg){
    Child c=new Child(5,8);
  }
}
