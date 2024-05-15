
class circle1{
  public double radius;
  public double area(){
    return Math.PI*radius*radius;
  }
  public double perimeter(){
    return 2*Math.PI*radius;
  }
}
public class circle {
  public static void main(String arg[]){
    circle1 c1=new circle1();
    c1.radius=7;
    System.out.println(c1.area());
    System.out.println(c1.perimeter());
  }
}
