//Use Tree Map with Sorted Ordered 

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SmallerThenNextNumber1 {
    public static int[] SmallCurrentElementOfOthers(int[] nums){
        TreeMap <Integer, Integer> freqMap  = new TreeMap<>();

        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        System.out.println(freqMap);
        HashMap <Integer, Integer>  map = new HashMap<>();
        int countSoFar = 0;
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int number = entry.getKey();
            int Value = entry.getValue();
            map.put(number, countSoFar);
            countSoFar += Value;
        }
        int arr[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = map.get(nums[i]);
        }
        
        return arr;
    }
    public static void main(String[] args){
        int nums[]  = {8,1,2,2,3};
        System.out.println(Arrays.toString(SmallCurrentElementOfOthers(nums)));
    }
    
}
