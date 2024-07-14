import java.util.*;
// multithreading using thread
class Mythread extends Thread{
  public void run(){
    int i=1;
    while(true){
      System.out.println(i+" "+"Hello");
      i++;
      if(i==15) break;
    }
  }
}
public class thread {
  public static void main(String[] args) {
    Mythread m=new Mythread();
    m.start();
    int i=1;
    while(true){
      System.out.println(i+" "+"World");
      i++;
      if(i==15) break;
    }
  }
}
