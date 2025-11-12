package zArray_Question20_java;



// 11. Find the Intersection of Two Arrays
//  Input: ([1, 2, 3], [2, 3, 4])
//  Output: [2, 3]
//  Explanation: The common elements are 2 and 3.

public class InteresectionArray {

    // using recursion 
    static void findElement(int[] arr, int[] arr1,int st, int st2){
        if(st2>arr1.length-1) return;
        if(arr[st]== arr[st2]){
            System.out.println(arr[st]);
        }
        findElement(arr, arr1, st, st2+1);

    }
    public static void findArrayNum(int[] arr, int[] arr1,int st){
        if(st>arr.length-1) return;
        findElement(arr,arr1,st,0);
        findArrayNum(arr, arr1, st+1);
    }
    public static void main(String args[]){
        int[] num = {1,2,3};
        int[] num1 = {2,3,4};

        findArrayNum(num,num1,0);

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num1.length; j++){
                if(num[i] == num1[j]){
                    System.out.print(num[i]+" ");
                }
            }
        }
        
    }
}
