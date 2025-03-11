class minimum_value{
  static int findMin(int[] arr){
    int res=arr[0];
    for(int i=1;i<arr.length;i++){
      res=Math.min(res,arr[i]);
    }
    return res;
  }
  public static void main(String[] args){
    int[] arr={7,1,0,8,9,5,6};
    System.out.println(findMin(arr));
  }
}