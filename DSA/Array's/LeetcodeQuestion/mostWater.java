package LeetcodeQuestion;

public class mostWater {
    public static int maxArea(int[] height) {
        int n = height.length;
        int i = 0; 
        int j = n;
        if(n == 1){
            return 1;
        }
        int firstLargest = 0;
        int secondLast = 0;
        while(i < j){
            if(firstLargest<height[i]){
                secondLast = firstLargest;
                firstLargest = height[i];
            }else if(secondLast < height[i] && height[i] != firstLargest){
                secondLast = height[i];
            }
            i++;
        }
        int width = (int)Math.min(firstLargest, secondLast);
        // int LastLargest = 0;
        i = n-1;
        j = 0;
        // while(i>j){
        //     if(LastLargest<height[i]){
        //         secondLast = LastLargest;
        //         LastLargest = height[i];
        //     }
        //     i++;
        // }
        // System.out.println(firstLargest+" "+LastLargest);
        int area = width*secondLast;
        return area;
        
    }

    public static void main(String[] args){
        int nums[] = {1,1};
        int result = maxArea(nums);
        System.out.println(result);
    }
    
}
