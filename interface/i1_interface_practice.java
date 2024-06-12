interface Test{  // interface will have all abstract and public method
  void meth1();
  void meth2();
}
class My implements Test{
  public void meth1(){
    System.out.println("meth1");
  }
  public void meth2(){ 
    System.out.println("meth2");
  }
  public void meth3(){ 
    System.out.println("meth3 of mine");
  }
}
public class i1_interface_practice {
  public static void main(String[] args) {
    Test s=new My(); // methods will be called based on the objects
    s.meth1();
    s.meth2();
    // s.meth3();  this can not be done as there not defined meth3() in Test super class and reference is here super class
  }
}
