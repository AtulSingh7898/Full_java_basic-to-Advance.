package BinarySearch.java;

// techniqu 2nd 
public class binarySearch2 {
    static int binarySearch(int[] nums, int tar){
        int st = 0;
        int end = nums.length-1;
        while(st <= end){
            int mid = st+(end-st)/2;
            if(tar == nums[mid]){
                return mid;
            }else if(tar> nums[mid]){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {1,2,4,11,23,24,54,66,89};
        int tar = 89;
        System.out.println(binarySearch(nums, tar));
        
    }
    
}
