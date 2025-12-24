// 38. Find the Median of Two Sorted Arrays
//  Input: ([1, 3], [2])
//  Output: 2.0
//  Explanation: The median of the combined sorted array [1, 2, 3]
// is 2.

public class MidienNumber {

    static double findMedianNumber(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[n+m];
        int i=0, j=0, k = 0;

        while(i < m && j < n){
            if(nums1[i]<nums2[j]) merged[k++] = nums1[i++];
            else merged[k++] = nums2[j++];
        }
        
        while(i < m) merged[k++] = nums1[i++];
        while(i < n) merged[k++] = nums2[j++];

        int len = merged.length;

        if(len%2 == 1){
            return merged[len/2];
        }else{
            return (merged[len/2-1]+merged[len/2])/2.0;
        }

    }
    public static void main(String[] args){
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double result = findMedianNumber(nums1, nums2);
        System.out.println(result);
    }
}

//         while (i < m) merged[k++] = nums1[i++];
//         while (j < n) merged[k++] = nums2[j++];

//         int len = merged.length;
//         if (len % 2 == 1) {
//             return merged[len / 2];
//         } else {
//             return (merged[len / 2 - 1] + merged[len / 2]) / 2.0;
//         }
//     }

//     public static void main(String[] args) {
//         int[] nums1 = {1, 3};
//         int[] nums2 = {2};
//         System.out.println(findMedianSortedArrays(nums1, nums2)); // 2.0
//     }
// }
