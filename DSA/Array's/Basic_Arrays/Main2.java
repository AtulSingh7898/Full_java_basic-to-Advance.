//Mathod in java
//Arrays.toString(arr) -> print the element of array
//Arrays.deepCopy(2dArrays) -> we are use in the 2d array
//Arrays.sort -> sort for element in the arrays
//Arrays.binarySearch(arr, key); search any element into the arrays
//Arrays.copyOf(arr, length); - for copy to another array
//Arrays.copyOfRange(arr, from, to) -> Arrays.copyOfRange(arr, 2, 5);
//Arrays.fill(arr, value); fill the value into the arrays
//Arrays.equals(arr,arr2); copare two array of value 
// == double equals -> check the reference address of array;
//Arrays.deepEquals(arr1,arr2) 

import java.util.Arrays;

public class Main2 {
    public static void passArrMathod(int[] arr){
        System.out.println("THe number of array is: ");
        for(int nums : arr){
            System.out.print(nums+" ");
        }
    }

    static int[] creatArray(int size){
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i*2;
        }
        return arr;
    }

    public static void main(String[] args) {

        int []arr = {12,54,32,50,66,76,56};

        int[] ArraysN = new int[arr.length*2];
        System.out.println("The size of arr "+ArraysN.length);

        for(int i = 0; i < arr.length; i++){
            ArraysN[i] = arr[i];
        }
        ArraysN[7] = 20;
        ArraysN[8] = 30;
        ArraysN[9] = 40;
        ArraysN[10] = 20;
        ArraysN[11] = 20;
        ArraysN[12] = 30;
        ArraysN[13] = 40;
        
        for(int nums : ArraysN){
            System.out.print(nums+" ");
        }
        System.out.println();
        
        arr = ArraysN;
        System.out.print(Arrays.toString(arr));




        // int[] arr1 = creatArray(5);
        // for(int atul : arr1){
        //     System.out.print(atul+" ");
        // }


        ////passing array int the method
        // passArrMathod(arr);

        // Arrays.sort(arr);
        // System.out.println("The sorted arrays is "+Arrays.toString(arr));

        // int[] copyArray = Arrays.copyOf(arr, 5);
        // System.out.println("The array copy is "+Arrays.toString(copyArray));

        // int [] arr = {121,232,443,453,122,323,456,554};
        // System.out.println("Array the rank of "+Arrays.copyOfRange(arr, 1,4));

        // int[] arrayFill = new int[5];
        // Arrays.fill(arrayFill, -1);
        // System.out.println("Filled arr is "+Arrays.toString(arrayFill));

        // int[] arr = {12,44,22,55,32};
        // int index = Arrays.binarySearch(arr, 22);
        // System.out.println("The element exist the in index "+ index);

        // // copy into the rang of array
        // int[] arr2 = Arrays.copyOfRange(arr, 0, 5);
        // System.out.print("The in copy the range of "+Arrays.toString(arr2));

        // //fill the arr of any value 
        // int[] arr3 = new int[5];
        // Arrays.fill(arr3, -1);
        // System.out.println("The arr element is "+ Arrays.toString(arr3));

        // int[] arr = {1,2,3};
        // int[] arr2 = {1,2,3};
        // int[] arr3 = new int[]{1,2,3};
        // boolean checkarr = arr == arr2;
        // boolean checkarr1 = arr == arr3;
        // //== double equals to reference or address
        // System.out.println("the array compare arr and arr2 is using double eqauls> "+checkarr);
        // System.out.println("the array compare arr and arr3 is using double eqauls> "+checkarr1);
        
        // //Arrays.equals only chekc the value 
        // System.out.println("the array compare arr and arr2 is> "+Arrays.equals(arr, arr2));
        // System.out.println("the array compare arr and arr3 is> "+Arrays.equals(arr, arr3));

        // String str  = "Atul"; //if we have a same value in the String to point str2 value of str in stack to head memeory location 
        // String str2 = "Atul"; //it's called immutable data type
        // String name = "2";
        // System.out.println(str+name);

        // String str3 = new String("Atul");
        // boolean checkstr = str == str2;
        // boolean checkstr1 = str == str3;

        // System.out.println("the array compare str and str2 is using double eqauls> "+checkstr);
        // System.out.println("the array compare str and str3 is using double eqauls> "+checkstr1);
        
        // //Arrays.equals only chekc the value 
        // System.out.println("the array compare str and str2 is> "+str.equals(str2));
        // System.out.println("the array compare str and str3 is> "+str.equals(str3));        
        
    }
    
}
