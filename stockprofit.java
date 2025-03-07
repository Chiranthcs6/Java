public class stockprofit{
  public static int maxProfit(int[] price){
    int maxProfit=0;
    
    for(int i=0;i<price.length;i++){
      for(int j=i+1;j<price.length;j++){
        int profit=price[j]-price[i];
        maxProfit=Math.max(maxProfit,profit);
      }
    }
    return maxProfit;
  }
  public static void main(String[] args) {
      int[] price={1,1,7,8,9,5};
      System.out.println("Max profit:"+maxProfit(price));
  }
}