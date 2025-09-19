@FunctionalInterface
interface abc {
    int test( int i, int j);
}

class Lambda1 {
    public static void main(String[] args) {
        abc obj =(i, j)-> i+j ;
        abc obj1 =(i, j)-> i*j ;
        abc obj2 =(i, j)-> i-j ;
        abc obj3 =(i, j)-> i/j ;
       System.out.println("Sum of i and j :"+ obj.test( 10,5));
       System.out.println("Mul of i and j :"+ obj1.test( 10,5));
       System.out.println("Sub of i and j :"+ obj2.test( 10,5));
       System.out.println("div of i and j :"+ obj3.test( 10,5));

    }
}