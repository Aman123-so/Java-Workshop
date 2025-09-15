public class ReturnTypeTest2{
    public int add(int x ,int y){
        int z= x+y;
        return z;
    }
    public static void main(String args []){
        ReturnTypeTest2 test = new ReturnTypeTest2();
        int add = test.add(10,20);
        System.out.println("The sum of x and y is:"+ add);
    }
}
