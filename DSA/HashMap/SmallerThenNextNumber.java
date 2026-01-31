import java.util.Arrays;
import java.util.HashMap;

public class SmallerThenNextNumber {
  static int[] NextGreaterNumber(int[] nums){
    int n = nums.length;
    HashMap <Integer, Integer> FreqMap = new HashMap<>();
    for(int num: nums){
      FreqMap.put(num, FreqMap.getOrDefault(num, 0)+1);
    }

    int[] unique = new int[FreqMap.size()];
    int i = 0;
    for(int key : FreqMap.keySet()){
      unique[i] = key;
      i++;
    }
    System.out.println(Arrays.toString(unique));
    Arrays.sort(unique);
    System.out.println(Arrays.toString(unique));
    HashMap <Integer, Integer> map = new HashMap<>();
    int countSoFar = 0;
    for(int num : unique){
      map.put(num, countSoFar);
      countSoFar += FreqMap.get(num);
    }
    System.out.println(map);

    int result[] = new int[n];
    // int a = 0;
    for(int j = 0; j < n; j++){
      result[j] = map.get(nums[j]);
    }

    return result;
  }
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        // int[] arr = new int[0];
        int result[] = NextGreaterNumber(nums);
        for(int res: result){
          System.out.println(res);
        }
    }
}
