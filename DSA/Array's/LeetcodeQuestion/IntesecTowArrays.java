// package LeetcodeQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class IntesecTowArrays {
    public static int[] intersectionTowArrays(int[] num1, int[] num2){
        Arrays.sort(num1);
        Arrays.sort(num2);
        Set<Integer> set = new HashSet<>();
        int i = 0, j = 0;
        while(i < num1.length && j < num2.length){
            if(num1[i] == num2[j]){
                set.add(num1[i]);
                i++;
                j++;
            }else if(num1[i]<num2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] arr = new int[set.size()];
        int k = 0;
        for(int num : set){
            arr[k++] = num; 
        }
        return arr;
        
    }
    public static void main(String args[]){
        int []num1 = {1,2,2,1};
        int[] num2 = {2,2};
        int[] result  = intersectionTowArrays(num1,num2);
        System.out.println(Arrays.toString(result));
    }
    
}
