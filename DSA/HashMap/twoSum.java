import java.util.HashSet;

public class twoSum {
    static boolean twoSum(int[] num, int target){
        
        boolean result  = false;
        HashSet <Integer> set = new HashSet<>();
        for (Integer nums: set) {
            if(set.contains(target-nums)){
                result = true;
            }
            set.add(nums);
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {3,5,2,6,7};
        int target = 9;
        System.out.println(twoSum(nums, target));
       
    }
    
}
