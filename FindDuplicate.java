import java.util.HashSet;
public class FindDuplicate {
  public static void findduplicate(int[] arr){
    HashSet<Integer>seen= new HashSet<>();
    HashSet<Integer> duplicate= new HashSet<>();

    for(int num:arr){
      if(!seen.add(num)){
        duplicate.add(num);
      }
    }
    System.out.println("Duplicate elemet:"+duplicate);
  }
  public static void main(String[] args) {
      int[] arr={1,1,2,4,5,6,7,7,8,2,21};
      findduplicate(arr);
  }
}
