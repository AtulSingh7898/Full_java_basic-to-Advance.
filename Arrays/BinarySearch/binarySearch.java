package BinarySearch;

public class binarySearch {

    static int searchBinary(int[] nums, int target){
        int st = 0, end = nums.length-1;

        // while(st <= end){
        //     int mid = (end+st)/2;
        //     if(target > nums[mid]){
        //         st = mid+1;
        //     }else if(target < nums[mid]){
        //         end  = mid;
        //     }else{ 
        //         return mid-1;
        //     }

        // }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,5,6,12,14};
        int target = 14;
        System.out.println(searchBinary(nums, target));

        int st = 0, end = nums.length-1;
        while(st <= end){
            int mid = (end+st)/2;
            if(target > nums[mid]){
                st = mid+1;
            }else if(target < nums[mid]){
                end  = mid-1;
            }else{
                System.out.println(mid);
                break;
            }

        }
    }
    
}
