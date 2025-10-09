
import java.util.*;

public class Arlist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(25);
        list.add(2, 30);
        System.out.println(list);
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        LinkedList<String> linklist = new LinkedList<>();
        linklist.add("hello");
        System.out.println(linklist);

        Vector vec = new Vector();
        vec.add(12);
        vec.add(11);
        vec.add(10);

        System.out.println(vec.isEmpty());
        System.out.println("is remove element is :" + vec.remove(2));
        System.out.println("vector size: " + vec.size());
        System.out.println(vec.capacity());
        System.out.println(vec);

        Stack<Integer> stc = new Stack<>();
        stc.add(15);
        stc.add(14);
        stc.add(10);
        stc.add(11);
        stc.add(0, 2);
        stc.push(40);
        stc.pop();
        stc.removeIf(n -> n % 2 == 0);
        System.out.println(stc.indexOf(15));
        System.out.println("check peek" + stc.peek());
        System.out.println(stc.lastIndexOf(15));
        System.out.println(stc);

    }
}
