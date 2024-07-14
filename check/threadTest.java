// import java.util.*;
class Mythread extends Thread{
  public Mythread(String name){
    super(name);
  }
}
public class threadTest {
  public static void main(String[] args) {
    Mythread t=new Mythread("THREAD 1");
    System.out.println(t.threadId());
    System.out.println(t.getName());
    System.out.println(t.getPriority());
    System.out.println(t.getState());
  }
}
