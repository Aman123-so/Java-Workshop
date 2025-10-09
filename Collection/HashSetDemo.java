import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
      
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple"); 

        System.out.println("HashSet: " + set);
        System.out.println("Contains Banana: " + set.contains("Banana"));
        System.out.println("Contains Orange: " + set.contains("Orange"));

        set.remove("Banana");
        System.out.println("After removing Banana: " + set);

        System.out.println("Iterating through HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
        System.out.println("Size of HashSet: " + set.size());
    }
}
