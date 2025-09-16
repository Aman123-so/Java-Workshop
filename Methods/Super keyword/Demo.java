class emp {
    float salary = 100000;
}

class HR extends emp {   // ✅ HR now inherits emp
    float salary = 200000;

    void display() {
        System.out.println("HR salary: " + salary);       // HR class salary
        System.out.println("Emp salary: " + super.salary); // Parent class salary
    }
}

public class Demo {
    public static void main(String[] args) {
        HR obj = new HR();
        obj.display();
    }
}