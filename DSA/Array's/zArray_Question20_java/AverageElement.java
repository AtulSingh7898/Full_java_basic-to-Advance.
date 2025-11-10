package zArray_Question20_java;

public class AverageElement {
    // with recursion code 
    static int SumOfAvaragElement(int arr[], int st){
        if(st > arr.length-1) return 0;
        return arr[st]+SumOfAvaragElement(arr, st+1);

    }
    // without recursion;
    static int AllAvaragaElement(int[] arr){
        int sum = 0;
        // int avarage = 0;
        // int count = 0;
        // for(int i = 0; i < arr.length; i++){
        //     sum += arr[i];
        //     // count++;
        // }
        // System.out.println(sum);
        sum = SumOfAvaragElement(arr, 0);
        return sum/arr.length;
    }
    public static void main(String args[]){
        int[] element = {1,2,3,4,5};
        int sum = 0;
        int result = AllAvaragaElement(element);
        System.out.println("The avarage element in arr of "+ result);
        
    }
    
}
