package zArray_Question40_java;

import java.util.Arrays;

// 8. Move All Zeros to the End of an Array
//  Input: [0, 1, 0, 3, 12]
//  Output: [1, 3, 12, 0, 0]
//  Explanation: The array with zeros moved to the end is [1, 3, 12, 0, 0];

public class moveZero {
    public static void main(String[] args){
        int num[] = {0, 1, 0, 3, 12};
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < num.length){
            if(num[i] != 0){
                int temp = num[j];
                num[j] = num[i];
                num[i] = temp;
                j++;
                
            }
            i++;
        }
        System.out.println(Arrays.toString(num));

    }
    
}
