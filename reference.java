public class reference {
  static void update(int A[],int idx,int value){
    A[idx]=value;
  }
  public static void main(String args[]){
    int A[]={1,2,3,4,5,6};
    update(A,1,9);   // this will change as A[] is an object here
    // when passing an object to a parameter its reference is passed
    for(int i:A){
      System.out.println(i);
    }
  }
}
