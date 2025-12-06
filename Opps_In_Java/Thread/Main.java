// package Thread;
//Thread is like a saparate path of execution inside a program.
// It allow to java to perform the multiple task simultaneously.

// inheriat class thread 
class myThread extends Thread{
    public void run(){
        System.out.println("The Thread is Running:....");
    }
}
public class Main{
    public static void main(String[] args) {
        myThread t = new myThread();
        t.start();
    }
}