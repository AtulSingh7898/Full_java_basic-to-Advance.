// package zArray_Question40_java;

public class SumElement {
    public static int sumArrayElement1(int[] arr, int st){
        // time complexity - O(n); that is run nth time in the single for stack
        // space complexity - O(n); that is take the space in mamory stack because recuresion take the memory in stack
        // full stack n time and empty stack n time n+n = 2n but constant avoid so there for time complexity O(n);
        
        if(st > arr.length-1) return 0;
        return arr[st]+sumArrayElement1(arr, st+1);
    }
    

    public static int sumArrayElement(int[] arr){
        // time complexity - O(n); that is run nth in the single for loop
        // space complexity - O(1); that is take the space on 1 element of and take 2 alocation 
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }   
        return sum;
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        // time complexity - O(n); that is run nth in the single for loop
        //
        // int sum = 0;
        // for(int num : arr){
        //     sum += num;
        // }
        // System.out.println("The sum of array element is "+sum);

        // int result = sumArrayElement(arr);
        // System.out.println("The sum of array element is "+ result);

        int result1 = sumArrayElement1(arr,0);
        System.out.println("The sum of array2 element is "+ result1);
    }
    
}
