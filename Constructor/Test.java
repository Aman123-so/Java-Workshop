
class Test {

    Test(String n) {
        System.out.println("Name is : "+ n);

    }
    Test(int age){
        System.out.println(age);
    }

    public static void main(String[] args) {

        Test obj1 = new Test("Aman");
        Test obj2 = new Test(18);

    }
}
