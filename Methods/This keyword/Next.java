class Next {
    int d;
    String color;

    // Constructor
    Next(int d, String color) {
        this.d = d;        
        this.color = color;   
    }

    void show() {
        System.out.println(d + " " + color);
    }

    public static void main(String args[]) {
        Next e1 = new Next(111, "RED");
        Next e2 = new Next(112, "BLACK");

        e1.show();
        e2.show();
    }
}
