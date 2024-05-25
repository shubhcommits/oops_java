abstract class shape{
  abstract public double area();
  abstract public double perimeter();
}
class Circle extends shape{
  double radius;
  public double area(){
    return Math.PI*radius*radius;
  }
  public double perimeter(){
    return 2*Math.PI*radius;
  }
}
class Rectangle extends shape{
  double length;
  double breadth;
  public double area(){
    return length*breadth;
  }
  public double perimeter(){
    return 2*(length+breadth);
  }
}
public class a2_abstract {
  public static void main(String[] args) {
    Circle c=new Circle();
    c.radius=2.0;
    System.out.println(c.area());
    System.out.println(c.perimeter());
    Rectangle r=new Rectangle();
    r.length=2.0;
    r.breadth=2.0;
    System.out.println(r.area());
    System.out.println(r.perimeter());
  }
}
