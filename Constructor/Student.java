public class Student {
    int id;
    String name;

    // Constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        // Creating objects and calling constructor
        Student s1 = new Student(101, "Aman");
        Student s2 = new Student(102, "Rahul");

        // Displaying values
        s1.display();
        s2.display();
    }
}
