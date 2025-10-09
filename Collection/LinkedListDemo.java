import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(30);
        System.out.println("LinkedList :"+ numbers);

        // add at first and last
        numbers.addFirst(5);
        numbers.addLast(40);
        System.out.println("After addFirst  and addLast :"+ numbers);

        //remove
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("After removals : "+numbers);

        //peek 
        System.out.println("peek first : "+ numbers.peekFirst());
        System.out.println("peek first : "+ numbers.peekLast());
    }
}