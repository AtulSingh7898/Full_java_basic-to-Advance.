import java.util.Arrays;

public class Practic2 {
    public static void main(String args[]){
        // int[] arr = {12,24,46,52,76,25,21};
        // System.out.println("The first number of array "+arr[0]);
        // System.out.println("The first last Number of array "+arr[arr.length-1]);
        // System.out.println("The length of array "+(arr.length-1));
        // System.out.println("The first number of array "+arr[0]);

        // System.out.println("The usorted arr is ");
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i]+" ");

        // }
        // System.out.println();
        // // sorted array is here

        // Arrays.sort(arr);
        // System.out.println("The sorted array is ");
        // for(int nums : arr){
        //     System.out.print(nums+" ");
        // }

        // int[] arr = new int[5];
        // Object[] arr = new Object[5];

        // for(int i = 0; i <arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }

        // for(int i = 0; i <arr.length; i++){
        //     arr[i] = 10;
        // }

        // arr[0] = "Atul";
        // arr[1] = true;
        // arr[2] = 'c';
        // arr[3] = 2.2;
        // arr[4] = 10;

        // for(Object a : arr){
        //     System.out.print(a+" ");
        // }
        // System.out.println();
        // for(int i = 0; i <arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }

        // // inset the number in arr Insertion
        // int[] arr = {12,32,4,12,44,56};
        // int insetIndex = 2;
        // int insetValue = 200;
        // for(int i = arr.length-1; i >insetIndex; i--){
        //     arr[i] = arr[i-1];
        // }
        // arr[insetIndex] = insetValue;

        // for(int nums : arr){
        //     System.out.print(nums+" ");
        // }

        // deletion the number in arr delete
        int[] arr = {12,32,4,12,44,56};
        int deletIndex = 2;
        for(int i = 0; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;

        for(int nums : arr){
            System.out.print(nums+" ");
        }
        
    }
    
}
