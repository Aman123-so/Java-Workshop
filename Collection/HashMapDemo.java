import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        map.put(4, "Orange");
        System.out.println("HashMap: " + map);
        System.out.println("Value at key 2: " + map.get(2));
        System.out.println("Value at key 5 (not present): " + map.getOrDefault(5, "Not Found"));
        System.out.println("Contains key 3? " + map.containsKey(3));
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana"));
        map.remove(4);
        System.out.println("After removing key 4: " + map);
        System.out.println("\nIterating using keySet():");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + " → Value: " + map.get(key));
        }
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println("\nSize of HashMap: " + map.size());
    }
}






