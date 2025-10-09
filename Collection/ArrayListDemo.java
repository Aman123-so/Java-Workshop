import java.util.*;
public class ArrayListDemo{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java");
        System.out.println("ArrayList: " + list);
        System.out.println("Element at index 1: " + list.get(1));
           list.set(2,"c#");
        System.out.println("after modification " + list);
        list.remove("java");//first occurance
        for(String lang : list ){
            System.out.println("language : "+ lang);
        }
    }
}