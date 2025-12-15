// . Find the Majority Element in an Array
//  Input: [3, 3, 4, 2, 4, 4, 2, 4, 4]
//  Output: 4
//  Explanation: The majority element is 4.

public class majorityElement {
    static int findMajorityElement(int[] nums){
        int count = 0;
        int result = 0;
        int major = nums[0];
        int move = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = nums.length-1; j > i+1; j--){
                if(i > move){
                    move = i;
                    count = 0;
                }
                if(nums[i] == nums[j]){
                    count+=1;
                    if(count > result){
                        result = count;
                        major = nums[i];
                    }
                }
            }
        }
        return major;
    }
    
    public static void main(String[] args){
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int result = findMajorityElement(nums);
        System.out.println(result);
    }
}
