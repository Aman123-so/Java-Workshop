import java.util.*;
class Arlist1 {

    public static void main(String[] args) {
       Vector vec= new Vector();
       vec.add(12);
       vec.add(11);
       vec.add(10);
       vec.add("ravi");
       System.out.println(vec.isEmpty());
       System.out.println("is remove elements is :" + vec.remove(2));
       System.out.println("Vector size " + vec.size());
       System.out.println(vec.capacity());
       System.out.println(vec);

       Stack<Integer> stc = new Stack();
       stc.add(15);
       stc.add(14);
       stc.add(10);
       stc.add(11);
        stc.add(0, 2);
        stc.add(40);
        stc.pop();
       stc.removeIf(n -> n%2 == 0);
       System.out.println(stc.indexOf(15)); 
       System.out.println("check peak " + stc.peek()); 
       System.out.println("stc.lastIndexOf(15)"); 
       System.out.println(stc); 
    }
}