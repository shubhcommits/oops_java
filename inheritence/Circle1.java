class Circle{
  public double radius;
  public double area(){
    return Math.PI*radius*radius;
  }
  public double perimeter(){
    return 2*Math.PI*radius;
  }
}
class Cylinder extends Circle{
  public double height;
  public double volume(){
    return area()*height;
  }
}
public class Circle1 {
  public static void main(String[] args){
    Cylinder c=new Cylinder();
    c.radius=6;
    c.height=5;
    System.out.println("Volumme is : "+c.volume());
    System.out.println("area is : "+c.area());
  } 
}
