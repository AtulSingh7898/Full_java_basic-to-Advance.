package Basic_Question;
public class SecLarg {
    public static void main(String args[]){
        int[] nums = {20,30,12,58,98,98,46};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int n : nums){
            if(n > first){
                second = first;
                first = n;
            }else if (n>second && n != first){
                second = n;
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println(second+" Number is Not second largest number in the arr");
        }else System.out.println(second+" Number is second largest number in the arr");
        
    }
    
}
