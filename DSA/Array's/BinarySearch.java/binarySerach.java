package BinarySearch.java;

public class binarySerach {
    // using recursion 
    static int binarySerachR(int[] nums, int target, int st, int end){
        if(st > end) return -1;
        int mid = st+end;
        if(target > nums[mid]) st = mid+1;
        else if(target < nums[mid]) end = mid-1;
        else return mid;
        return binarySerachR(nums, target, st, end);
    }

    static int serachElement(int[] nums, int target){
        int st = 0, end = nums.length;

        while(st <= end){
            int mid = (st+end)/2;

            if(target > nums[mid]){
                st = mid+1;
            }else if(target < nums[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {-1,0,2,4,8,12};
        int tar = 4;
        // System.out.println(serachElement(nums, tar));
        System.out.println(binarySerachR(nums, tar, 0, nums.length-1));
    }
}
