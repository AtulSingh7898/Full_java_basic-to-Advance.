package TwoPointer;
//leet code
public class TrappingRainWater {

    public static int trap(int[] height) {
        int left = 0;
        int sum = 0;
        int right = height.length;
        for(int i = 0; i < right; i++){
            sum += height[i];
        }
        for(int i = right-1; i>0; i--){
            if(sum>0){
                left += sum-i;
            }
        }
        int result = 0;
        for(int i = left; i < right; i++){
            result = Math.min(left, sum);
        }
        return result;
    }
    public static void main(String args[]){
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = trap(arr);
        System.out.println(result);
    }
    
}
