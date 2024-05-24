// dynamic method dispatch
class super_class{
    public void display(){
      System.out.println("Hello SUPER_CLASS");
    }
}
class sub_class extends super_class{
  public void display(){
    System.out.println("Hello sub_class");
  }
}
public class Over_ridig {
  public static void main(String[] args) {
    super_class sb=new sub_class();  // reference of parent class and object of sub class run the method of subclass whose object is created
    sb.display();
  }
}
