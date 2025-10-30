import java.util.Arrays;

public class Practic1 {
    public static void main(String args[]){
        // int[] arr = {12,44,55,22,48};
        // System.out.println("The length of array "+arr.length);
        // System.out.println("The first element of arr "+arr[0]);
        // System.out.println("The second last element of array "+arr[arr.length-2]);
        // System.out.println("The final element of array "+arr[arr.length-1]);

        // without sorted array it's mean unsorted arr
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        // for(int nums : arr){
        //     System.out.print(nums+" ");
        // }
        // System.out.println();
        // //sorted arr
        // Arrays.sort(arr);
        // for(int nums : arr){
        //     System.out.print(nums+" ");
        // }

        // insetion in value in the array
        // int[] arr = {21,3,5,5,44,65,22};
        // int insetIndex = 3;
        // int insertValue = 500;

        // for(int i = arr.length-1; i > insetIndex; i--){
        //     arr[i] = arr[i-1];
        // }
        // arr[insetIndex] = insertValue;
        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }

        //delet the element with index of arr
        // int[] arr = {21,3,5,44,65,22};
        // int deletIndex = arr.length-1;
        // System.out.println(deletIndex);

        // for(int i = deletIndex; i < arr.length-1; i++){
        //     arr[i] = arr[i-1];
        // }
        // arr[deletIndex] = 0;
        // for(int nums : arr){
        //     System.out.print(nums+" ");
        // }

        //start array using the new keyword
        // int[] arr = new int[5];
        // Object[] arr = new Object[5];
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
        // // for(int i = 0; i < arr.length; i++){
        // //     arr[i] = 10;
        // // }


        // arr[0] = "atul";
        // arr[1] = 'A';
        // arr[2] = true;
        // arr[3] = 12.3;
        // arr[4] = 22; 

        // System.out.println();
        // // for (int i : arr) {
        // //     System.out.print(i+" ");
        // // }
        // for (Object i : arr) {
        //     System.out.print(i+" ");
        // }

        //copyelement int array using copy toString

        // int[] arr = {12,24,54,22,44};

        // int[] copyArray = Arrays.copyOf(arr, arr.length-2);
        // System.out.println("The element of array "+Arrays.toString(arr));
        // System.out.println("THe length of array "+(arr.length-2));
        // System.out.println("The element of array "+Arrays.toString(copyArray));
        // System.out.println("THe length of array "+(copyArray.length));

        // int[] arr = {12,11,23,45,58};
        // try{
        //     System.out.println(arr[6]);
        // }catch(Exception e){
        //     System.out.println(e.getMessage());
        // }

        // it create to manully for java
        // int[] arr = {11,23,45,58};
        // int index = 3;
        // if(index >= 0 && index < arr.length){
        //     System.out.println("index "+index+" in element of arr is "+arr[index]);
        // }else{
        //     System.out.println("index "+index+" out of bound for length "+arr.length);
        // }
        
    }
}
