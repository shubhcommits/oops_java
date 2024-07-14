public class Generic<T> {
  private T obj;
  public void setData(T v){
    obj=v;
  }
  public T getData(){
    return obj;
  }
  public static void main(String[] args) {
    Generic<String> gd=new Generic<>();
    gd.setData("sm");
    System.out.println(gd.getData());
  }
}
