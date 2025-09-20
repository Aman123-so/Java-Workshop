public class arst {
    public static void main(String[] args) {
        int value = 25;
        assert value <= 20 : "underweight";
        System.out.println("value is "+ value);

    }
}
// java -ea AssertionTest1 in command promt  = for enable
// java -da AssertionTest1 in command promt  = for disable