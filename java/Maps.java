import java.util.Map;
import java.util.HashMap;
import java.util.List;
public class Maps {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> numbers = new HashMap<>();

     numbers.put("one", 1);
     numbers.put("two", 2);
     numbers.put("three", 3);

     for(Map.Entry<String, Integer> entry : numbers.entrySet()) {
         System.out.println("The key is: " + entry.getKey() + " the value is " + entry.getValue());
     }
    }
   public static void complexList(){
    Map<String, List<Integer>> numbers = new HashMap<>();
    
    numbers.put("one", List.of(1, 2, 3));
    numbers.put("two", List.of(4, 5, 6));
    numbers.put("three", List.of(7, 8, 9));
    for(Map.Entry<String, List<Integer>> entry : numbers.entrySet()) {
        System.out.println("The key is: " + entry.getKey() + " the value is " + entry.getValue());
    }
   } 

}