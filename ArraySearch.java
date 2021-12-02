class ArraySearch {
  public static double searchMin(double speedArr[]){
      int arrSize = speedArr.length;
      double min = speedArr[0];
      for(int i=1;i<arrSize;i++){
        if(speedArr[i] < min){
          min= speedArr[i];
        }
      }
      return min;
  }
  public static void main(String[] args) {
    double[] speedArr = {7.78,6.54,4.54,5.67,4.66,6.99,9.8,6.55};
    double min= searchMin(speedArr);
    //System.out.println("ArraySearch.main()");
    System.out.println("Minimum value: "+ min);

    
  }
}