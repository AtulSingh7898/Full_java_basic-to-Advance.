package zArray_Question40_java;

public class FindMin {
    public static void main(String []args){
        int[] arr = {0,5, 4, 3, 2, 1};
        int min = arr[0];
        for(int i = 0; i <arr.length; i++){
            if(arr[i]>min){
                // System.out.println(" ");
            }else{
                min= arr[i];
            }
        }
        System.out.println("The min value is "+ min);

    }
    
}
