class animal{
    animal(){
        System.out.println("animal is created");
    }
}
class dog extends animal {
    dog(){
        super();
        System.out.println("dog is created");
    }
}

public class Supertest {
    public static void main(String[] args) {
        dog d = new dog();
    }
    
}