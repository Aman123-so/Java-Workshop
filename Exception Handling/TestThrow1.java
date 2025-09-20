public class TestThrow1 {
    public static void validate(int age) {
        if (age<18){
            throw new ArithmeticException("person is not eligible for vote");
        }
        else{
            System.out.println("Person is eligible to vote!!");
        }
    }
    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of code");
    }
}