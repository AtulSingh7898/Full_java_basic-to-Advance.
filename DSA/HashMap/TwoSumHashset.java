//find the two sum using hashset

import java.util.HashMap;

public class TwoSumHashset {
    static int[] findTwoSum(int[] nums, int target){
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{nums[i], i};
            }
        }
        return new int[]{};
    }
    public static  void main(String[] arsg){

    }
    
}
