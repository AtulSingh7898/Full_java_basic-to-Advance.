public class subsetArray {
    static boolean subsetOfArray(int[] nums, int[] subset){
        int count = 0;
        boolean isSubset = false;
        for(int i = 0; i<subset.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        if(count == subset.length){
            isSubset = true;
        }
        return isSubset;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        int subset[] = {2,3,4};
        boolean result = subsetOfArray(nums, subset);
        System.out.println(result);
    }
    
}
