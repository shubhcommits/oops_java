class Rectangle{
  int length;
  int breadth;
  Rectangle(){
    length=1;
    breadth=1;
  }
  Rectangle(int l,int b){
    length=l;
    breadth=b;
  }
}
class Cuboid extends Rectangle{
  int height;
  Cuboid(){
    height=1;
  }
  Cuboid(int h){
    height=h;
  }
  Cuboid(int l,int b,int h){
    super(l,b);  // here parameter is passing to parent constructor
    height=h;
  }
  int volume(){
    return length*breadth*height;
  }
}
public class parent_paramet {
  public static void main(String[] arg){
    Cuboid c=new Cuboid(5,5,5);
    System.out.println("Area of cuboid is "+ c.volume());
  }
}
