public class GreatestPrime {
    static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        if (n >= 2) isPrime[2] = true;
        for (int i = 3; i <= n; i += 2) isPrime[i] = true;

        for (int i = 3; i * i <= n; i += 2) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += 2 * i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    public static int largestPrimeConsecutiveSum(int n) {
        boolean[] isPrime = sieve(n);

        int sum = 0;
        int maxPrime = 0;

        // Sum consecutive primes starting from 2
        for (int i = 2; i <= n; i++) {
            if (!isPrime[i]) continue;

            sum += i;
            if (sum > n) break;

            if (isPrime[sum]) {
                maxPrime = sum;
            }
        }

        return maxPrime;
    }

    // public static boolean primeNumber(int num){
    //     if(num<2) return false;
    //     for(int i = 2; i <= num/2; i++){
    //         if(num%i == 0)return false;
    //     }
    //     return true;
    // }
    public static void main(String[] args) {
         
        // int result = 0;
        // int resent = 0;
        int nums = 20;
        System.out.println(largestPrimeConsecutiveSum(nums));

        // for(int j = 2; j <= nums; j++){
        //     if(primeNumber(j)){
        //         result += j;
        //     }
        //         // int num2 = result;
        //     if(primeNumber(result) && result <= nums){
        //         resent = result;
        //     }
            
        // }
        // System.out.println(resent);
        
    }
    
}
