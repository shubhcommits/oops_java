/*************************************************************************************///item class
class items{
  private String itemNo;
  private String name;
  private double price;
  private int quantity;
  public items(String no){
    itemNo=no;
  }
  public items(String no,String name){
    itemNo=no;
    this.name=name;  // {this} is used to reference as a current object
  }
  public items(String no,String nam,double prc,int qty){
    itemNo=no;
    name=nam;  
    setprice(prc);
    set_quantity(qty);
  }
  public void setprice(double price){
    this.price=price;
  }
  public void set_quantity(int quantity){
    this.quantity=quantity;
  }

  public String getItemNo(){ return itemNo;}
  public String get_name(){ return name;}
  public double get_price(){ return price;}
  public int get_quantity(){ return quantity;}
}
/*************************************************************************************///Customer class
class customer{
  private String id;
  private String name;
  private String address;
  private String phone_no;

  public customer(String id,String name){
    this.id=id;
    this.name=name;
  }
  public customer(String id,String name,String address,String phone_no){
    this.id=id;
    this.name=name;
    setAddress(address);
    set_phone_no(phone_no);
  }

  public void setAddress(String address){
    this.address=address;
  }
  public void set_phone_no(String phone_no){
    this.phone_no=phone_no;
  }

  public String getid(){return id;}
  public String getname(){return name;}
  public String get_address(){return address;}
  public String get_phone_no(){return phone_no;}
}
/**************************************************************************************/// main class
public class market {
  public static void main(String []arg){
    items item1=new items("abc","charger",50,10);
    customer customer1=new customer("A1","Shubham","Delhi","+91222222222");

    System.out.println("Item no : "+item1.getItemNo()+"\n"+
    "name : "+item1.get_name()+"\n"+
    "Price : "+item1.get_price()+"\n"+
    "Quantity : "+item1.get_quantity()+"\n");

    System.out.println("ID : "+customer1.getid()+"\n"+
    "Name : "+customer1.getname()+"\n"+
    "Location : "+customer1.get_address()+"\n"+
    "Phone number : "+customer1.get_phone_no()+"\n"+
    "have to buy items : "+"\n");
  }
}