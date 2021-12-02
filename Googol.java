public class Googol{
  public static void main(String args[]){
    String gool = "1";
    int len = gool.length();
    while(len<101){
      gool += "0";
      len += 1;
    }
    System.out.println(gool);
    System.out.println("Size of string: "+len);


  }
}