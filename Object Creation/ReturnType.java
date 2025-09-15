public class ReturnType {
    public int add() {  
        int x = 30;
        int y = 34;
        int z = x+y;
        return z;
    }
    public static void main(String[] args) {
        ReturnType test = new ReturnType();
        int add = test.add();
        System.out.println("sum is:"+add);
    }
}