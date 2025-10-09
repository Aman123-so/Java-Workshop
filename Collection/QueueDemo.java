import java.util.*;
public class QueueDemo{
    public static void main(String[] args) {
        
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("PriorityQueue:" + pq);
        System.out.println("Head element:" + pq.peek());
        pq.poll();
        System.out.println("After poll:" + pq);
        for(Integer num: pq){
            System.out.println("Element : + num");
        }


       
    }
}