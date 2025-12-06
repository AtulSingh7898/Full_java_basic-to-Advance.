import java.util.Arrays;

public class MissingNumber2 {
//  4. Find the Smallest Missing Positive Integer
//  Input: [3, 4, 1, 1]
//  Output: 2
//  Explanation: The smallest missing positive integer is 2.
    public static void main(String[] args){
        int[] num = {3, 4, 1, 1};
        Arrays.sort(num);
        int i = 0;
        int j = 0;
        int count = 0;

        while(i < num.length-1){
            if(num[i]+1 != num[j+1]) {
                count = num[i]+1;
            }
            i++;
            j++;
        }
        System.out.println(count);
    }
    
}
