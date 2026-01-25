import java.util.Arrays;
import java.util.HashMap;

public class SmallerThenNextNumber {
    static int[] NextGreaterNumber(int[] nums){
    HashMap <Integer, Integer> freqMap = new HashMap<>();
      for(int num: nums){
        System.out.println();
        freqMap.put(num, freqMap.getOrDefault(num, 0));
      }
      System.out.println(freqMap);
      return nums;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] arr = new int[0];
        int result[] = NextGreaterNumber(nums);
        Arrays.sort(nums);
        System.out.println(result.toString());
    }
}
