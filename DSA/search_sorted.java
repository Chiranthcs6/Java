class search_sorted{
  static int binarysearch(int x,int lo,int hi,int[] arr){
    while(lo<=hi){
      int mid=lo+(hi-lo)/2;
      if(arr[mid]==x) return mid;
      if(arr[mid]<x) lo=mid+1;
      else hi=mid-1;
    }
    return -1;
  }
  
}