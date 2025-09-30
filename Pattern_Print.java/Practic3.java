public class Practic3 {


    // static void printPattern(int i)
    public static void main(String[] args) {
        int num = 5; 

        for(int i = num; i >= 1; i--){
            for(int j = 1; j <= num-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i-1); j++){
                if(j == 1 || i == num || j == (2*i-1)){
                    System.out.print("*");
                }
                else{
                    
                    System.out.print("");
                }
            }
            System.out.println("");
        }
    }
    
}
