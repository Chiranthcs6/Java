import java.util.Arrays;

class product_array{
  static int[] productExceptSelf(int[] arr){
    int n=arr.length;
    int[] res=new int[n];
    Arrays.fill(res,1);
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(i!=j){
          res[i]*=arr[j];
        }
      }
    }
    return res;
  }
  public static void main(String[] args){
    int[] arr={10,3,5,6,7,8};
    int[] res= productExceptSelf(arr);
    for(int val:res){
      System.out.println(val+"");
    }
  }
}