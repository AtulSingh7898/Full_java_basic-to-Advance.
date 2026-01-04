public class SearchInsertPos {
    static int searchInsert(int[] nums, int target){
        int left = 0, right = nums.length-1;
        while(left<= right){
            int mid = left+(right-1)/2;
            if(nums[mid] < target){
                left = mid+1;
            }else if(nums[mid]> target){
                right = mid-1;
            }else{
                return mid;
            }
        }
        return left;
    }
    public static void main(String[] args){
        int num[] = {1,2,3,5,6};
        int target = 5;
        System.out.println(searchInsert(num, target));

    }
}
