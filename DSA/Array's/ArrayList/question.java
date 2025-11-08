import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class question {
    public static void main(String[] args) {
        //add two number in arr
        
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


        // int[] arr = {65,34,2,43,6,3,4,1};
        // int lastelement = arr[0];
        // int firstelement = arr[arr.length-1];

        // two pointer approach 
        // int i = 0, j = arr.length-1;
        // while(i <j){
        //     int temp =arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        //     i++; 
        //     j--;
        // }


        // for(int i = 0, j = arr.length-1; i <j;  i++, j--){
        //     int temp =arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        // }
        // System.out.println("The revvese arr  is: "+Arrays.toString(arr));


        ArrayList<Integer> list = new ArrayList<>();
        int n = 7;
        int second = 0;
        int next = 1;
        int temp = 0;
        while(temp < n){
            int first = second;
            System.out.print(first+" ");
            list.add(first);
            second = next;
            next = first+second;
            temp++;
        }

        // for(int i = 0; i <= n; i++){
        //     int first = second;
        //     System.out.print(first+" ");
        //     list.add(first);
        //     second = next;
        //     next = first+second;
        // }

        Iterator<Integer> iterator = new Iterator();


        System.out.println();
        list.forEach(A->System.out.print(A+" "));
        System.out.println();
        // System.out.println("The list of arr is: "+list);
        // for each
        for(int num : list){
            System.out.print(num+" ");
        }
        // for(int i = 0; i < list.size(); i++){
        //     System.out.print(i);
        // }


    }
    
}
