
import java.util.ArrayList;
import java.util.Arrays;

// 40. Find the Elements Common to Two Sorted Arrays
//  Input: ([1, 2, 4, 5, 6], [2, 3, 5, 7])
//  Output: [2, 5]
//  Explanation: The common elements are 2 and 5
public class CommonElement {
    
    public static void main(String[] args) {
        int[] nums1 = {1,2,4,5,6};
        int[] nums2 = {2,3,5,7};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    list.add(nums1[i]);
                }
            }
        }

        System.out.println(list);
        int[] result = new int[list.size()];
        int k = 0;
        for(int i : list){
            result[k++] = i;
        }
        
        System.out.println(Arrays.toString(result));

    }
}
