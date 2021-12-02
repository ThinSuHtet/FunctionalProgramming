public class CountingBlocks{
  public int countBlocks(int levels){
    int total = 0;
    for(int i=1;i<=levels;i++){
      
      total = total + (i*i);
    }
    return total;
  }
  public static void main(String[] args){
    CountingBlocks c1 = new CountingBlocks();
    System.out.println(c1.countBlocks(4));
  }
}