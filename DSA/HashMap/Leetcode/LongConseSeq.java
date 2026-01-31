package Leetcode;

import java.util.HashSet;

public class LongConseSeq {
    public static int longestConseSequence(int[] nums){
        
        if(nums.length == 0)  {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }
        int longest = 0;

        for(int num : set) {
            if(!set.contains(num-1)) {
                int currentNum = num;
                int currentLength = 1;
                
                while(set.contains(currentNum+1)) {
                    currentNum++;
                    currentLength++;
                }
                longest = Math.max(longest, currentLength);
            }
            
        }
        return longest;
    }
    public static void main(String[] args){

        int[] nums = {100,4,200,1,3,2};
        int result = longestConseSequence(nums);
        System.out.println(result);
    }
}
