import java.util.function.Predicate;

public class PerfactRec{
    public static int Perfact(int num, int i){
        if(i == num/2){
            return num/2;
        }
        if(num%i == 0){
            return i+Perfact(num, i+1);
        
        }else{
          return Perfact(num, i+1);
        }
    }
    

    public static void main(String[] args) {

        // Parfact Number java
        int num = 14;
        int sum = Perfact(num, 1);
        if(sum == num){
            System.out.println("The number is perfact");
        }else{
            System.out.println("the number is not perfact");
        }
    }

}