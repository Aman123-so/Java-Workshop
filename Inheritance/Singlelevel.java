
class A {
    void e() {
        System.out.println("eing..");
    }
}

class B extends A {
    void y () {
        System.out.println("Ying..");
    }

}

class Singlelevel {
    public static void main(String args[]) {
        B d = new B();   // object of child class
        d.y ();           // calling child class method
        d.e();           // calling parent class method
    }
}
