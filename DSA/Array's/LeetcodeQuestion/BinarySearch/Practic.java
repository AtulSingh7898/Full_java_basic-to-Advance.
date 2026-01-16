package BinarySearch;
// 
public class Practic {
    public static boolean KMissingElement(int nums[],int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[left] == nums[mid] && nums[mid] == nums[right]){
                right--;
                left++;
            }else if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(nums[right] <= target && target < nums[mid]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }

        }
        return false;
        
    }
    public static void main(String[] args){
        int x[] = {1,2,3,0,4};
        int k = 0;
        System.out.println(KMissingElement(x,k));

    }
    
}
