import java.util.HashMap;

public class SubEqualK {
    public static int SubArraySumEqualToK(int[] nums, int k){
        HashMap <Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum  = 0;
        map.put(0,1);
        for(int i : nums){
            sum += i;
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }        
        return count;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        int k = 3;
        System.out.println(SubArraySumEqualToK(arr, k));
        

        
    }
    
}
