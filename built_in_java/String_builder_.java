public class String_builder_ {
  public static void main(String[] args) {
    StringBuilder sb=new StringBuilder();
    sb.append("Hello");
    sb.append(" ");
    sb.append("Shubham");
    sb.insert(6,"Shubham ");  // can append at the specified position in an string
    sb.delete(0,2); // 2 is not included in deleting
    System.out.println(sb.toString());

    // can also revrse the string
    sb.reverse();
    System.out.println(sb.toString());
  }
}
