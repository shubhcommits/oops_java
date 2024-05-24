class tv{
  public void switchOn(){
    System.out.println("TV is switched on");
  }
  public void change_channel(){
    System.out.println("TV channel is running");
  }
}
class SmartTv extends tv{
  @Override
  public void switchOn(){
    System.out.println(" smart TV is switched on");
  }
  @Override
  public void change_channel(){
    System.out.println("smart TV channel is running");
  }
  public void browse(){
    System.out.println("smart tv is browsing");
  }
}
public class override_tv {
  public static void main(String[] arg){
    tv t=new SmartTv();
    t.change_channel();
    t.switchOn();
    // this can be done that reference is child class and object made is super class
    // t.browse();  // can not browse as referne don't contain this
  }
}

// if there is no parameter int super class then for overriding child also should have no parameter and if have parameter the parameter should be same    either it becomes overloading
