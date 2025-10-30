import java.util.Arrays;

public class Practic {
    public static void main(String args[]){
        //unsorted array
        // int[] arr = {60,10, 20, 30, 50, 60};
        // System.out.println("the first element of array "+arr[0]);
        // System.out.println("the last index number in the arr "+ arr[arr.length-1]);
        // System.out.println("The lenght of arr "+arr.length);
        // Arrays.sort(arr);

        //sorted arr using Arrays class sort object for sort array elemet mathod
        // System.out.println("the sorted array ");
        // for(int num : arr){
        //     System.out.print(num+" ");
        // }

        // int[] arr1 = new int[arr.length-6];
        // for(int i = 0; i < arr1.length; i++){
        //     System.out.print(arr1[i]+" ");
        // }

        // insertion
        // int[] arr = {12, 43, 54, 44, 56, 32};
        // int insertIndex = 2;
        // int insertValue = 100;
        // for(int i = arr.length-1; i > insertIndex; i--){
        //     arr[i] = arr[i-1];
        // }
        // arr[insertIndex] = insertValue;
        // for(int num : arr){
        //     System.out.print(num+" ");
        // }

        // deletion the value of index

        // int[] arr = {12,21,32,35,65,54};
        // int deleteIndex = 2;
        // for(int i = deleteIndex; i < arr.length-1; i++){
        //     arr[i] = arr[i+1];
        // }
        // arr[deleteIndex] = 0;
        // for(int num : arr){
        //     System.out.print(num+" ");
        // }

        // array declaration intialization using new keyword
        // int[] arr  = new int[5];

        // using Object class as a treat of data type
        // Object[] arr = new Object[5];
        // for(int i : arr) {
        //     System.out.println(i);
        // }

        // for(int i = 0; i < arr.length;i++){
        //     arr[i] = 10;
        //     // System.out.println(arr[i]);
        // } 
        // arr[0] = 10;
        // arr[1] = 10.10;
        // arr[2] = "Atul";
        // arr[3] = true;
        // arr[4] = 'c';
        // for(int i = 0; i < arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        // for(Object num : arr){
        //     System.out.print(num+" ");
        // }

        //copy arr bye reference of two string
        // int[] arr = {12,32,54,66,76};
        // int[] copyArray = Arrays.copyOf(arr, arr.length-2);
        // System.out.println("The Array of length "+(arr.length));
        // System.out.println("The original Array "+Arrays.toString(arr));
        // System.out.println("The array's the number "+(copyArray.length-2));
        // System.out.println("The copy arr is "+Arrays.toString(copyArray));

        // try catch using for get massage trough of extra size bound of arr
        // int[] arr = {12,34,43};
        // try{
        //     System.out.println(arr[5]);
        // } catch (Exception e) {
        //     System.out.println("Error-> "+e.getMessage());
        // }

        // int[] arr = {233,3453,5332,4343};
        // int index = 3;
        // if(index >= 0 && index < arr.length){
        //     System.out.println("The index "+index+ " array of number is "+arr[index]);
        // }else{
        //     System.out.println("index "+ index + " out of bound for length "+arr.length);
        // }
    }
    
}
