class Box<T,V> {
    private V name;
    private T age;

    public void set(T age,V name) {
        this.age = age;
        this.name = name;

    }

    public T get() {
        return age;
    }
    public V get1() {
        return name;
    }
}

public class GenericClass1{
    public static void main(String[] args) {
        Box<String,Integer> box = new Box<>();
        box.set("Aman",19);
        System.out.println("name : " + box.get());
        System.out.println("age : " + box.get1());
    }
} 
