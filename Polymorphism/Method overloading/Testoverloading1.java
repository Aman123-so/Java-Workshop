





class Adder{
    static int add(int a, int b)
    {
        return a+b;
    }
    static  int  add (int a, int b, int c){
        return a+b+c;
    }
}
class Testoverloading1 {
    public static void main(String[] args) {
        System.out.println(Adder.add(11,20));
        System.out.println(Adder.add(12,1,50));
        
    }}
        
