import java.util.Arrays;

public class BasicLinkList {
    public static void main(String[] args) {
        //add number in arr
        
        // int[] arr = {1, 2,3,54};
        // int result = 0;
        // for(int i = 0; i < arr.length; i++){
        //     result += arr[i];
        //     // result++;
        // }
        // System.out.println(result);
        // result = 0;
        // for(int i : arr){
        //    result += i;
        // }
        // System.out.println(result);

        // int [] arr = {12,34,54,55,54,99};

        // int minArr = arr[0];
        // int maxArr = arr[0];

        // for(int i = 0; i < arr.length; i++){
        //     if(minArr>arr[i]){
        //         minArr = arr[i];
        //     }if(maxArr<arr[i]){
        //         maxArr = arr[i];
        //     }
        // }

        // System.out.println("the minimul number "+minArr);
        // System.out.println("the minimul number "+maxArr);

        // for(int i = arr.length-1; i >= 0; i--){
        //     System.out.print(arr[i]+" ");
        // }

        // sorted arr use binary search and two pointer's
        // reverse the an arr 

        int[] arr = {65,34,2,43,6,3,4,1};

        int i = 0, j = arr.length-1;
        while(i <j){
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; 
            j--;
        }


        // for(int i = 0, j = arr.length-1; i <j;  i++, j--){
        //     int temp =arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        // }
        System.out.println("The revvese arr  is: "+Arrays.toString(arr));
    }
    
}
