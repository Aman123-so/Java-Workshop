public class ImmutableStringExample{
    public static void main(String [] args){
        String str ="Hello ";
        str.concat("World");
        System.out.println("After concat: " +str );

        str = str.concat("World");
        System.out.println("After reassignment: " +str); 

    }
}
