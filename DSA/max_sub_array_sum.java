public class max_sub_array_sum {
  static int maximum_array_sum(int[] arr){
    int res=arr[0];
    for(int i=0;i<arr.length;i++){
      int currsum=0;
      for(int j=i;j<arr.length;j++){
        currsum=currsum+arr[j];
        res=Math.max(res,currsum);
      }
    }
    return res;
  }
    public static void main(String[] args){
    int[] arr={-2,1,7,8,5,-1};
    System.out.println(maximum_array_sum(arr));  
  }
}
