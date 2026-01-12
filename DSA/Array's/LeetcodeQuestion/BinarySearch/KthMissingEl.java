package BinarySearch;
// hrhinakaushik@gmail.com
// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

// Return the kth positive integer that is missing from this array.


public class KthMissingEl {
    static int KthMissingElement(int[] arr, int k){
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = left+(right-left)/2;
            int missing = arr[mid]-(mid+1);
             if(missing >= k){
                right = mid - 1;

            }else{
                left = mid + 1;
            }

        }
        return left+k;
    }
    public static void main(String[] args){
        int nums[] = {2,3,4,7,11};
        int nums2[] = {1,2,3,4};
        int k = 2;
        int result = KthMissingElement(nums2, k);
        System.out.println(result);
    }
}
