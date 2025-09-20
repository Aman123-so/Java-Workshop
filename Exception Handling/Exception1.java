public class Exception1 {
    public static void main(String[] args) {
       try {
           int x = 10;
        int result = x / 0;
        System.out.println(result);
       } 
       catch (Exception e) {
        System.out.println(e);
       } 
        
        
        System.out.println("This code is access after ;");
    }
}
 