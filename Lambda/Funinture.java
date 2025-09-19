@FunctionalInterface
interface abc {
    void test();
}

class Funinture {
    public static void main(String[] args) {
        abc obj = new abc() {
            public void test() {
                System.out.println("I am interface");
            }
        };
        obj.test();
    }
}
