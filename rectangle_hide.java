  class  test{
  private int length;
  private int breadth;
  public int getLength(){
    return length;
  }
  public int getBreadth(){
    return breadth;
  }
  public void setLength(int l){
    length=l;
  }
  public void setBreadth(int b){
    breadth=b;
  }
  public int area(){
    return breadth*length;
  }
  public int perimeter(){
    return 2*(length+breadth);
  }
}

public class rectangle_hide{
  public static void main(String []args){
    test r=new test();
    r.setLength(5);
    r.setBreadth(5);
    System.out.println("Area is "+r.area());
    System.out.println("Area is "+r.perimeter());
  }
}
