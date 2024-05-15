class test{
  public int roll_no;
  public String name;
  public test(){
    roll_no=58;
    name="Shubham";
  }
  public test(int x,String nam){  // here constructor overloaded
    roll_no=x;
    name=nam;
  }
  public void print(){
    System.out.println("Student name : "+name+" Roll no : "+roll_no);
  }
}

public class constructor {
  public static void main(String arg[]){
    // test student=new test();  // this can also be done
    test student=new test(22,"Sachin");  // this is done using constructor
    student.print();
  }
}
