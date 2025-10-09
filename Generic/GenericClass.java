class Box<T> {
    private T value;
    public void set (T value){
    
        this.value = value;
    }
    public T get(){
        return value;
    }
    
}
public class GenericClass{
    public static void main(String[] args) {
        
        Box<String>Box= new Box<>();
         Box.set("Aman ");
         Box.set("Afroz");
    //   intBox.set(19);
        System.out.println("Box contains: " + Box.get());

    }
}