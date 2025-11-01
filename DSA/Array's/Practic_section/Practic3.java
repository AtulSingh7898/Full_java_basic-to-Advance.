import java.util.Arrays;

public class Practic3 {
    public static void main(String[] args) {
        // insertion 
        int[] arr = {22,11,33,54,52};
        int insertIndex = 2;
        int insertValue = 200;
        
        for(int i = arr.length-1; i >= insertIndex; i--){
            arr[i] = arr[i-1];
        }
        arr[insertIndex] = insertValue;

        for(int nums : arr){
            System.out.print(nums+" ");
        }
        

        int copyarr[] = Arrays.copyOf(arr, arr.length-1); 
        System.out.println();
        System.out.println("The size copyarrays element is" + Arrays.toString(copyarr));
        // System.out.println();
        System.out.println("The size of arr "+Arrays.toString(arr));
        // deletion value
        int[] arr2 =  new int[arr.length-1];
        int sum = Arrays.binarySearch(arr , 54);
        System.out.println(sum);
        

    }
    
}
