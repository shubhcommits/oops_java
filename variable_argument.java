public class variable_argument {
  static void show(int ...A){
    for(int x:A){
      System.out.println(x);
    }
  }
  public static void main(String args[]){
    // show();
    show(1,2,3,4);
    int A[]={5,2,2};
    show(A);
  }
}
