package training;
import java.util.*;
public class MapsArray {
    public static void main(String[] args) {
        // Create a map with Integer keys and List<String> values
        Map<Integer, List<String>> map = new HashMap<>();

        // Create some lists of strings
        List<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Dog", "Elephant"));

        // Add lists to the map
        map.put(1, list1);
        map.put(2, list2);

        // Create a new list for the last two keys
        List<String> sharedList = new ArrayList<>(Arrays.asList("X", "Y", "Z"));

        // Add the shared list to the last two keys using addAll()
        map.put(3, new ArrayList<>());
        map.put(4, new ArrayList<>());
        map.get(3).addAll(sharedList);
        map.get(4).addAll(sharedList);

        // Print the map
        System.out.println("Map contents:");
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
