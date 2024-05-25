// abstract class
// abstract class can not be final and static
// if an class extends abstract class then it should override that otherwise class becomes abstract
abstract class Super{
  public Super(){System.out.println("Super Constructor");}
  public void meth1(){
    System.out.println("Meth1 is Super");
  }
  abstract public void meth2();  // if not giving body to any method then should make it abstract
}
class Sub extends Super{
  @Override
  public void meth2(){
    System.out.println("Sub meth2");
  }
}

public class a1_abstract_exp {
  public static void main(String[] args) {
    Super s=new Sub();
    s.meth1();
    s.meth2(); // this is override in sub
  }
}
