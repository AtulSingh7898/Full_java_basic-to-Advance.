
// LeetCode


// 3736. Minimum Moves to Equal Array Elements III

public class Practic6{
    public static void main(String[] args){
        int arr[] = {4,4,5};
        int max = arr[0];
        for(int num : arr){
            if(max<num){
                max = num;
            }
        }
        // System.out.print("The max number is "+max);
        System.out.println();
        int count = 0;
        
        for(int i = 0; i < arr.length; i++){
            for(int j = arr[i]; j <= max; j++){
                if(arr[i] != max){
                   arr[i] += 1;
                   count++;
                }
            }
        }
        
        System.out.println("the take time to increase the element is "+count);
    }
}