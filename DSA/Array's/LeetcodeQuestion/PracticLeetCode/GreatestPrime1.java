package PracticLeetCode;

public class GreatestPrime1 {
    static boolean[] isPrimeNumber(int nums){
        boolean[] isPrime = new boolean[nums+1];
        if(nums>=2) isPrime[2] = true;
        for(int i = 3; i <= nums; i+=2) isPrime[i] = true;

        for(int i = 3; i*i<= nums; i+=2){
            for(int j = i*i; j<= nums; j += 2*i){
                isPrime[j]  = false;
            }
        }
        return isPrime;
    }
    static int GreatesPrimeNumber(int nums){
        boolean[] isPrime = isPrimeNumber(nums);
        int max = 0;
        int sum = 0;
        for(int i = 2; i<=nums; i++){
            if(!isPrime[i]){
                continue;
            }
            sum += i;
            if(sum > nums){
            break;
            }
            if(isPrime[sum]){
                max = sum;
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        int num  = 20;
        System.out.println(GreatesPrimeNumber(num));
    }
}
