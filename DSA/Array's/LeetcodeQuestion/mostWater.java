// package LeetcodeQuestion;

public class mostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left < right){
            int width = right-left;
            int h = Math.min(height[left], height[right]);
            int area = h*width;

            if(maxArea< area){
                maxArea = area;
            }if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args){
        int nums[] = {0,8,6,2,5,4,8,3,7};
        int result = maxArea(nums);
        System.out.println(result);
    }
    
}
