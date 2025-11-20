// ve Duplicates from an Array
//  Input: [1, 2, 2, 3, 4, 4, 5]
//  Output: [1, 2, 3, 4, 5]
//  Explanation: The array without duplicates is [1, 2, 3, 4, 5].
package zArray_Question40_java;

import java.util.ArrayList;

public class RemoveDuplicate {

    // static void recursiveDuplicate(ArrayList<Integer> addUniqu, int st){
    //     if(st > addUniqu.size()-1) return;
    //     if(!addUniqu.contains(addUniqu.get(st))){
    //         addUniqu.add(addUniqu.get(st));
    //     }
    //     recursiveDuplicate(addUniqu, st+1);
    //     // System.out.println("The list is-> "+addUniqu);
    // }

    public static ArrayList<Integer> removeDuplicate(int[] nums){
        ArrayList<Integer> addUniq = new ArrayList<>();
        for(int num : nums){
            if(!addUniq.contains(num)){
                addUniq.add(num);
            }
        }
        
        // recursiveDuplicate(addUniq,0);
        return addUniq;
    }

    
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 4, 5};
        // int result[] = removeDuplicate(nums); does not working on the reference method
        
        ArrayList<Integer> list = removeDuplicate(nums); 
        System.out.println("The list is "+ list);



        // ArrayList<Integer> list = new ArrayList<>(); 
        // for(int num : nums){
        //     list.add(num);
        // }

        // System.out.println("The list is "+ list);
        // System.out.println();
        // // recursiveDuplicate(list,0);
        // for(int i = 0; i < list.size(); i++){
        //     System.out.println(list.get(i));
        // }
    }

}
