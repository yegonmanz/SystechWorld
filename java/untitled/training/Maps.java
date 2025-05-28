package training;
import java.util.Map;
import java.util.HashMap;
public class Maps {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);

        for(Map.Entry<String, Integer> entry : numbers.entrySet()) {
            System.out.println("The key is:" + entry.getKey() + "the value is " + entry.getValue());
        }
    }

}
