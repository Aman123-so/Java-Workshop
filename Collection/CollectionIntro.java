import java.util.*;
public class CollectionIntro{
    public static void main(String[] args) {
        
  
 Collection <String> fruits = new ArrayList<>();
 fruits.add( "Apple");
 fruits.add( "Banana");
 fruits.add( "Mango");


 System.out.println("fruits collection "+ fruits);
 System.out.println("contains Mango "+ fruits.contains("Mango"));


fruits.remove("Banana");
System.out.println("After Removal :" + fruits);
System.out.println("size :" + fruits.size());
}

  }