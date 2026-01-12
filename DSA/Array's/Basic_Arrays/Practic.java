
import java.lang.annotation.Target;


public class Practic {

    static int binarySearch(int[] nums, int first, int end, int targate){
        if(first-1>end) return -1;
        int mid = (first+end)/2;
        if(targate > nums[mid])
            first = mid+1;
        else if(targate<nums[mid]) end = mid-1;
        else return mid;
        return binarySearch(nums, first, end, targate);
        
    }
    public static void main(String[] args){
        // sliding window 
        int[] nums = {1,2,4,5,10,11,15,18};
        int targate = 18;
        System.out.println(binarySearch(nums, 0, nums.length-1, targate));

        

    }
    
}
