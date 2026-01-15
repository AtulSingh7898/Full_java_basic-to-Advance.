package BinarySearch;
// 
public class Practic {
    public static int KMissingElement(int nums[],int k) {
        int left = 0;
        int right  = nums.length-1;

        while(left <= right){
            int mid = left+(right-left)/2;
            int missing = nums[mid] - (mid+1);
            if(missing >= k){
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }
        return left+k;
    }
    public static void main(String[] args){
        int x[] = {1,2,3,4};
        int k = 2;
        System.out.println(KMissingElement(x,k));

    }
    
}
