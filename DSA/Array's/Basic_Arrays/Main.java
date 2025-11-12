import java.util.Arrays;

public class Main{
    public static void main(String args[]){

        // int[] arr = {15,24,33,42,51}; /// arr litrall's
        // System.out.println("The first the of the elememt "+ arr[0]);
        // System.out.println("The second the of the elememt "+ arr[1]);
        // System.out.println("The last the of the elememt "+ arr[4]);
        // System.out.println("The lenght the of Arr "+ arr[arr.length-1]);
        // System.out.println("The lenght the of Arr "+ arr.length);

        // System.out.println("The Unsorted arr is : " );
        // //traversal in array 
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(" "+ arr[i]);
        // }
        // System.out.println();

        // // for each loop
        // System.out.println("The using the for each loop ");
        // for(int num : arr){
        //     System.out.print(num+" ");
        // }

        // // Arrays.sort(arr);
        // Arrays.sort(arr);
        // System.out.println();
        
        // System.out.println("The first the of the elememt "+ arr[0]);
        // System.out.println("The second the of the elememt "+ arr[1]);
        // System.out.println("The last the of the elememt "+ arr[4]);
        // System.out.println("The length the of Arr "+ arr[arr.length-1]);
        // System.out.println("The length the of Arr "+ arr.length);
        // System.out.println();

        // System.out.println("The sorted array is : " );
        // //traversal in array 
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(" "+ arr[i]);
        // }
        // System.out.println();

        // Intertion in update the lenght of 

        // int arr[] = {12,21,24,54,45};

        // int insertIndex = 2;
        // int insertValue = 100;
        // for(int i = arr.length-1; i > insertIndex; i--){
        //     arr[i] = arr[i-1];
        // }
        // arr[insertIndex] = insertValue;
        // System.out.println("The array  after insertion is : ");

        // for(int num : arr){
        //     System.out.print(num+" ");
        // }


        // the number is delete in the arrays

        int arr[] = {12,21,24,54,45};

        int deletIndex = 2;
        for(int i = deletIndex; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[deletIndex] = 0;
        System.out.println("The array after Delete element is : ");

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();

        // array declaration and initalization using new keyword
        // Object arr = new Object[5];
        // int[] arr = new int[5];
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]+" ");
        // }
        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = 10;
        // }

        // arr[0] = 10;
        // arr[1] = 10;
        // arr[2] = 10;
        // arr[3] = 10;
        // arr[4] = 10;

        // for Object
        // arr[0] = 10;
        // arr[1] = 10.2;
        // arr[2] = "Amit";
        // arr[3] = 1.13;
        // arr[4] = 10;

        // System.out.println();
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }

        // for(int num : arr){
        //     System.out.print(num+" ");
        // }
         
        // for object
        // for(Object num : arr){
        //     System.out.print(num+" ");
        // }
        

        //Copy element of array

        int[] arr1 = {11,12,34,53,45};
        int [] copyArray =Arrays.copyOf(arr1, arr1.length-2);
        System.out.println("original array : "+ Arrays.toString(arr1));
        System.out.println("The array of index "+ (arr1.length-2));
        System.out.println("Copy array : "+ Arrays.toString(copyArray));
        System.out.println("The array of index "+ (copyArray.length) );

        
        //try catch using in arr
        // int [] arre = {12,34,54};
        // try{
        //     System.out.println(arre[5]);
        //     //arr[5];
        // } catch(Exception e){
        //     System.out.println("Error "+e.getMessage());
        // }

        //  bound 

        // int[] arr = {10, 20, 30, 40,54};
        // int index = 4;

        // if(index >= 0 && index < arr.length){
        //     System.out.println("the arr Index "+index+" is array element "+arr[index]);
        // }else{
        //     System.out.println("index "+ index+" out of  bound for lenght "+(arr.length-1));
        // }

        //linear search 
        // int[] arr = {12,34,54,55,56};
        // boolean found = false;
        // int x = 34;

        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] == x){
        //         System.out.println("x is found index number "+i);
        //         found = true;
        //            break;
        //     }
        // }

        // if(!found){
        //     System.out.println("found of the arr ");
        //}
    }
}