
class A {

    void e() {
        System.out.println("eing..");
    }
}

class B extends A {

    void y() {
        System.out.println("Ying..");
    }
}

class C extends B {

    void z() {
        System.out.println("Hello.");
    }
}

class Multilevel {

    public static void main(String args[]) {
        D ob = new D();   // object of child class
        ob.e();           // calling child class method
        ob.y();           // calling parent class method
        ob.z();
        ob.p();

    }
}

class D extends C {

    void p() {
        System.out.println("test D");
    }
}
