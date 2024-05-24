// Constructor Inheritence in Java
class Parent{
  public Parent(){
    System.out.println("Parent class created");
  }
}
class child extends Parent{
  public child(){
    System.out.println("Child class created");
  }
}
class grandChild extends child{
  public grandChild(){
    System.out.println("grandchild class created");
  }
}
public class inheritence_const {
  public static void main(String[] args){
    grandChild g=new grandChild();
  }
}
