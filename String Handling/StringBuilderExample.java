public class StringBuilderExample{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ravi");
        sb.append("kumar");
        sb.delete(0,6 );
        sb.insert(0, "Hello");
        sb.reverse();
        System.out.println("Stringbuilder result : "+ sb);
    }

}