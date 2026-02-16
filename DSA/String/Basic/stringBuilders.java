package Basic;
import java.util.*;
// What is the difference between String, StringBuilder, and StringBuffer in Java?
// StringBuilder: Mutable and not thread-safe but faster compared to StringBuffer.

   
public class stringBuilders {
    public static void stringBuilderAsync(){
        StringBuilder string1 = new StringBuilder();
        Thread th1 = new Thread(() -> {
             for (int i = 0; i < 1000; i++) {
             string1.append("A");
            }
        });
        Thread th2 = new Thread(()->{
            for(int i = 0; i< 1000; i++){
                string1.append("B");
            }
        });
    
        th1.start();
        th2.start();
        try{
            th1.join();
            th2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("result is "+string1.toString());
        
    }
    
    public static void main(String[] args){
        stringBuilderAsync();
        
    }
    
}
