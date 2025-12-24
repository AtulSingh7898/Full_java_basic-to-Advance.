public class ContaineWithWater {
    public static void main(String[] args){
        int[] nums = {1,8,4,5,5,3,6,5,3,2,7};
        int left = 0;
        int right = nums.length-1;
        int maxElemenent = 0;

        while(left <= right){
            int width = right - left;
            int h = Math.min(nums[left], nums[right]);
            int area = width*h;
            if(maxElemenent<area){
                maxElemenent = area;
            }else if(nums[left] < nums[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(maxElemenent);
    }
}
