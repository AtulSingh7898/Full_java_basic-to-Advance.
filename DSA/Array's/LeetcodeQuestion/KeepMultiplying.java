// package LeetcodeQuestion;

// Keep Multiplying Found Values by Two
// Input: nums = [5,3,6,1,12], original = 3
// Output: 24
// Explanation: 
// - 3 is found in nums. 3 is multiplied by 2 to obtain 6.
// - 6 is found in nums. 6 is multiplied by 2 to obtain 12.
// - 12 is found in nums. 12 is multiplied by 2 to obtain 24.
// - 24 is not found in nums. Thus, 24 is returned.

public class KeepMultiplying{
    public static void main(String[] args) {
        // int[] arr = {8,19,4,2,15,3};
        int[] arr = {5,3,6,1,12};
        int original = 3;

        int i = 0; 
        // the time complexity O(n) 
        while(i < arr.length){
            if(arr[i] == original){
                original = original*2;
                i = 0;
            }else if(i == i){
                i++;
            }
            
        }
        // System.out.println(original);

        // time complextiy O(n^2)
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr.length; j++){
        //         if(arr[j] == original || arr[i] == original){
        //             original = original*2;
        //         }
        //         //else 
        //         // if(arr[i] == original){
        //         //     original = original*2;
        //         // }

        //     }
        // }
        System.out.println(original);
    }
}
