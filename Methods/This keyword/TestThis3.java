class Student {
    int rollno;
    String name, course;
    float fee;

    // Constructor with 3 parameters
    Student(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    // Constructor with 4 parameters
    Student(int rollno, String name, String course, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }
}

class TestThis3 {
    public static void main(String args[]) {
        Student s1 = new Student(111, "Aman", "java");
        Student s2 = new Student(112, "Afroz", "java", 60000);

        s1.display();
        s2.display();
    }
}
