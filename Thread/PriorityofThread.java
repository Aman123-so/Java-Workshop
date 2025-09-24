import java.lang.*;
class PriorityofThread extends Thread{
    public void run(){
        System.out.println("Inside run method" );
    }
    public static void main(String[] args) {
        PriorityofThread t1= new PriorityofThread();
       PriorityofThread t2= new PriorityofThread();
        PriorityofThread t3= new PriorityofThread();

        System.out.println("t1 thread priority: " + t1.getPriority());
        System.out.println("t2 thread priority: " + t2.getPriority());
        System.out.println("t3 thread priority: " + t3.getPriority());


        t1.setPriority(3);
        t2.setPriority(6);
        t3.setPriority(9);

        System.out.println("t1 thread priority :" + t1.getPriority());
        System.out.println("t2 thread priority :" + t2.getPriority());
        System.out.println("t3 thread priority :" + t3.getPriority());


        System.out.println("Currently Executing Threaad :" + Thread.currentThread().getName());

        System.out.println("Main thread priority :" + Thread.currentThread().getPriority());
         
         Thread.currentThread().setPriority(10);

         System.out.println("Main thread priority :" + Thread.currentThread().getPriority());
    }
}