// package LeetcodeQuestion;

public class MaxThird{
    int maxThird(int[] arr){
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(first<arr[i]){
                int temp = arr[i];
                third = second;
                second = first;
                first = temp;
            }else if(arr[i] < first && second< arr[i]){
                third = second;
                second = arr[i];
            }else if(second > arr[i] && third < arr[i]){
                third = arr[i];
            }
        }
        return (int)third;
        // return third != Long.MIN_VALUE ? (int)third: (int)first;
        
    }
    public static void main(String[] args){
        MaxThird m = new MaxThird();
        int[] arr = {12,34,43,21,56,43,65,63,67,22};
        int result = m.maxThird(arr);
        System.out.println("The max third is "+result);
    }
}