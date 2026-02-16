public class Factorials {
    public static int Factorial(int n, int st, int result){
        if(st>n){
            return result;
        }
        result*=st;
        return Factorial(n, st+1, result);
    }
    
    public static void main(String[] args) {
        int n = 5;
        int result = Factorial(n, 1,1);
        System.out.println(result);
    }
    
}
