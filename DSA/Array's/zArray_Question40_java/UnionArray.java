// package zArray_Question40_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// 12. Find the Union of Two Arrays
//  Input: ([1, 2, 3], [2, 3, 4])
//  Output: [1, 2, 3, 4]
//  Explanation: The union of the arrays is [1, 2, 3, 4]

public class UnionArray {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3};
        int[] num2 = {2, 3, 4};

        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set  = new HashSet<>();
        for(int i = 0; i < num1.length; i++){
            list.add(num1[i]);
        }
        for(int i = 0; i < num2.length; i++){
            if (!list.contains(num2[i])) {
                list.add(num2[i]);
            }
            list.add(num2[i]);
        }
        for(int i = 0; i < num2.length; i++){
            list.add(num2[i]);
        }
        
        for(int i : list){
            set.add(i);
        }
        System.out.println(set);
        System.out.println(list);

    }
    
}
