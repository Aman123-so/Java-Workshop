public class breakloop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) { // condition to stop the loop
                System.out.println("Loop breaks at i = " + i);
                break; // exit the loop immediately
            }
            System.out.println("i = " + i);
        }
    }
}