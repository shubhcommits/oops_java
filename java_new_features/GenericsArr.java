class Gen<T>{
  T arr[]=(T[])new Object[10];
  int len=0;
  public void append(T val){
    arr[len++]=val;
  }
  public void Display(){
    for(int i=0;i<len;i++){
      System.out.println(arr[i]);
    }
  }
}
class arr2<T> extends Gen<T>{  // child class extending parent class // if type <T> is not defind then this becomes object type

}
public class GenericsArr {
  public static void main(String[] args) {
    Gen<Integer> g=new Gen<>();
    g.append(5);
    g.append(6);
    g.append(7);
    g.append(8);
    g.Display(); 
  }
}
 