package BinarySearch;

// 153. Find Minimum in Rotated Sorted Array

public class FindMinRotate {
    
    public static int findMin(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid+1]) {
                left = mid + 1;
            } else if(nums[mid] < nums[mid+1]) {
                right = mid-1;
            }else if(nums[mid] > nums[right]) {
                left = mid+1;
            }else if(nums[left] > nums[left+1]){
                left = left+1;
            }

        }
        return nums[left];
    }
    public static void main(String[] args){
        int nums[] = {3,3,1,3};
        System.out.println(findMin(nums));
    }
    
}
