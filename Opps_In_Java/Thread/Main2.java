//thread using interface 

class myThread implements Runnable{
    public void run(){
        System.out.println("The thread is running:....");
    }
}
public class Main2 {
    public static void main(String[] Args){
        Thread t = new Thread(new myThread());
        t.start();
    }
    
}
