public class stringbufferExample{
       public static void main(String[] args) {
        StringBuffer str = new StringBuffer("hello");
        str.append(" world");
        System.out.println("stringbuffer result: "+str);
        str.insert(5,"java" );
        System.out.println("stringbuffer insert: "+str);
        str.replace(0, 5, "Hi");
        System.out.println("stringbuffer replace: "+str);
        str.reverse();
        System.out.println("stringbuffer reverse: "+str);

    }
}