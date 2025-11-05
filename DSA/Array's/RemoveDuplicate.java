import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicate {
    public static int[] removeDuplicate(int[] arr){
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int num : arr){
            if(!list2.contains(num)){
                list2.add(num);
            }
        }
        int[] result = new int[list2.size()];
        for(int i = 0; i < list2.size(); i++){
            result[i] = list2.get(i);
        } 
        return result;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,5,2,3};

        int [] arr1 = removeDuplicate(arr);
        System.out.println("The uiniq array is "+Arrays.toString(arr1));
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.println("The list of "+list);

    }
    
}
