//  Find the Peak Element in an Array
//  Input: [1, 3, 20, 4, 1, 0]
//  Output: 20
//  Explanation: The peak element is 20

public class peackElement{
    public static void main(String[] args){
        int[] nums = {1, 3, 20, 4, 1, 0};
        int peackEl = Integer.MIN_VALUE;
        for(int j : nums){
            if(peackEl<j){
                peackEl = j;
            }
        }
        System.out.println("the preack element is: "+peackEl);
    }
}
