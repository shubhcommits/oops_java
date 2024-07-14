import java.util.*;
// multithreading using runnable interface
class Test implements Runnable{
  public void run(){
    int i=1;
    while(true){
      System.out.println(i+" Hello");
      i++;
      if(i==10) break;
    }
  }
}
public class Runnable_thread {
  public static void main(String[] args) {
    Test te=new Test();
    Thread t=new Thread(te);
    t.start();
    int i=1;
    while(true){
      System.out.println(i+" world");
      i++;
      if(i==10) break;
    }
  }
}
