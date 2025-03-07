import java.util.HashMap;
import java.util.Map;
public class Hash {
  @SuppressWarnings("unlikely-arg-type")
  public static void main(String[] args) {
      Map<String,Integer> map=new HashMap<>();
      map.put("lis",1);
      map.put("ash",2);
      map.put("shhs",3);
      map.put("push",4);

      System.out.println("Value of key2:"+map.get(2));

      for(Map.Entry<String, Integer> entry:map.entrySet()){
        System.out.println("Key:"+entry.getKey()+",Value,"+entry.getValue());
      }
      if(map.containsKey(3)){
        System.out.println("Key 3 exists");
      }
      map.remove(4);
        System.out.println("Removed key element 4");
  }
  
}
