class Phone{
  public void call(){System.out.println("Phone call");}
  public void sms(){System.out.println("Phone setting sms");}
}
interface Icamera{
  void click();
  void record();
}
interface IMusicPlayer{
  void play();
  void stop();
}
class SmartPhone extends Phone implements Icamera,IMusicPlayer{
  public void videoCall(){System.out.println("Smart phone is video calling");}
  public void click(){System.out.println("clinking photo");}
  public void record(){System.out.println("recording video");}
  public void play(){System.out.println("playing video");}
  public void stop(){System.out.println("stop playing video");}
}
public class i2_interface_exp { 
  public static void main(String[] args) {
    SmartPhone sp=new SmartPhone();
    sp.videoCall();
    Phone p=sp;  // by this reference we can only call call and sms
    p.call();
    Icamera i=sp;
    i.record();  // by this reference of Icamera and object of SmartPhone I can only call methods of Icamers as reference is of I camera
  }
}
