
class Test {

    Test(String n) {
        System.out.println("Name is : "+ n);

    }
    Test(int age){
        System.out.println("Age:" +age);
    }
    Test(double  Salary){
          System.out.println( "Salary : " +Salary);
    }

    public static void main(String[] args) {

        Test obj1 = new Test("Aman");
        Test obj2 = new Test(18);
        Test obj3 = new Test(35000.50);

    }
}
