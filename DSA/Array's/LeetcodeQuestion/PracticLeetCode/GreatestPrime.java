package PracticLeetCode;

public class GreatestPrime {
    static  boolean[] sieveTheorme(int n){
        boolean[] isPrime = new boolean[n+1];
        if(n>= 2) isPrime[2] = true;
        for(int i = 3; i <= n; i+=2){
            isPrime[i] = true;
        }

        for(int i = 3; i*i <= n; i += 2){
            if(isPrime[i]){
                for(int j = i*i; j <= n; j += 2 * i){
                    isPrime[j] = false;
                }
            }
        }

       
        return isPrime;
    }
    public static int largestCunsecutivePrime(int n){
        boolean[] isPrime = sieveTheorme(n);
        int sum = 0;
        int maxSum  = 0;
        for(int i = 2; i<=n; i++){
            if(!isPrime[i]){
                continue;
            }
            sum += i;
            if(sum > n){
            break;
            }
            if(isPrime[sum]){
                maxSum = sum;
            }
            
        }
        
        return maxSum;
    }

    public static void main(String[] args){
        int n = 20;
        System.out.println(largestCunsecutivePrime(n));
    }
    
}
