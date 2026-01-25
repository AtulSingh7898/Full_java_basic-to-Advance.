public class Contigeouse {

    static boolean FindContigeouseArray(int[] nums){
        int count = 0;
        int size = nums.length-1;
        int max = 0;
        int min = 0;
        for(int i = 0; i <=size; i++){
            min =  Math.min(nums[i],nums[i+1]);
            max = Math.max(nums[i], nums[i]);
        }
        System.out.println(min+"  "+max);
        
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,4,5,2,1};
        boolean result = FindContigeouseArray(arr);
        System.out.println(result);


    }
    
}
