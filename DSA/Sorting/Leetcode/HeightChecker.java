package Sorting.Leetcode;

public class HeightChecker {
    public static int heightChecker(int[] nums){
        int count[] = new int[101];
        for(int n : nums){
            count[n]++;
        }
        int index = 0;
        int result = 0;
        for(int i = 0; i <=100; i++){
            while(count[i] > 0 ){
                if(nums[index]!= i){
                    result++;
                }
                index++;
                count[i]--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,4,2,1,3};
        System.out.println(heightChecker(nums));

    }
    
}
