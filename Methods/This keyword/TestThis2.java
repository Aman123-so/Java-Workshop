
class A {

    A() {
        this(5);  // calls parameterized constructor
        System.out.println("hello a");
    }

    A(int x) {
        System.out.println(x);
    }
}

class TestThis2 {
    public static void main(String args[]) {
        A a = new A();
    }
}

