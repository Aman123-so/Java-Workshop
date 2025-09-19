interface Sayable{
    public String say();

}
public class  Lambdastring{
    public static void main(String[] args) {
        Sayable s = ()-> "I am Lambda";
        System.out.println("Massage :"+ s.say());

        }
    }
