interface hello{
    void print();
}
class Hi implements hello{
    public void print(){
        System.out.println("Hello");
    }
    public static void main(String args []){
        Hi obj= new Hi();
        obj.print();
    }
}