public class mostwater{
        public static int maxArea(int[] nums) {
            int left = 0;
            int right = nums.length-1;
            int maximum = 0;
            
            while(left<= right){
                int width = right-left;
                int h = Math.min(nums[left], nums[right]);
                int area = h*width;
    
                if(maximum < area){
                    maximum = area;
                }else if(nums[right] < nums[left]){
                    right--;
                }else{
                    left++;
                }
            }
            return maximum;
        }
    
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
}