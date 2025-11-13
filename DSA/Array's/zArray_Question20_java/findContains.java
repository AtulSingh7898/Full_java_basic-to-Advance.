// 9. Check if an Array Contains a Given Element
//  Input: ([1, 2, 3, 4, 5], 3)
//  Output: true
//  Explanation: The array contains the element 3.

package zArray_Question20_java ;
public class findContains{

    public static boolean containElement(int[] nums, int x){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == x){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5};
        int x = 3;
        boolean y = containElement(nums, x);
        System.out.println("The element contain's "+y);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == x){
                System.out.println(true);
            }
        }
    }

}