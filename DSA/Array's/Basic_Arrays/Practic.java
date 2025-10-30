import java.util.Arrays;

public class Practic {
    public static void main(String args[]){
        //unsorted array
        int[] arr = {60,10, 20, 30, 50, 60};
        System.out.println("the first element of array "+arr[0]);
        System.out.println("the last index number in the arr "+ arr[arr.length-1]);
        System.out.println("The lenght of arr "+arr.length);
        Arrays.sort(arr);

        //sorted arr using Arrays class sort object
        System.out.println("the sorted array ");
        for(int num : arr){
            System.out.print(num+" ");
        }

        int[] arr1 = new int[arr.length-6];
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
    }
    
}
