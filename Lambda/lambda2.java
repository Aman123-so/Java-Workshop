interface Sayable {
    String say(String a, String b);
}

public class lambda2 {
    public static void main(String[] args) {
        Sayable s = (a, b) -> a + " " + b; 
        Sayable s1 = (a, b) -> String.valueOf(a.length() + b.length());

        System.out.println("Message: " + s.say("Aman", "Gupta"));
        System.out.println("Length: " + s1.say("Aman", "Gupta"));
    }
}
