//this question for identify of dynamic programing question's

public class fabonacci {
    static int fabonacciRecursive(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1) return 1;
        return fabonacciRecursive(n-1)+fabonacciRecursive(n-2);
    }
    public static void main(String[] args){
        
        int n = 7;

        for(int i = 0; i<=n; i++){
            System.out.println(fabonacciRecursive(i));
        }
    }
    
}
