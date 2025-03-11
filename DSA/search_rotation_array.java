public class search_rotation_array {
  static int find(int[] arr,int key){
    int left=0,right=arr.length-1;
    while(left<right){
      int mid=left+(right-left)/2;

      if(arr[mid]==key){
        return mid;
      }
      if(arr[left]<=arr[mid]){
        if(key>=arr[left]&&key<arr[mid]){
          right=mid-1;
        }
        else{
          left=mid+1;
        }  
        }
      else{
        if(key>arr[mid]&&key<=arr[right]){
          left=mid+1;
        }
        else{
          right=mid-1;
        }
      }
    }
    return -1;
  }
  public static void main(String[] args) {
      int[] arr={3,5,6,8,9,1,8};
      int key=8;
      System.out.println("Index vale"+find(arr, key));
  }
}
