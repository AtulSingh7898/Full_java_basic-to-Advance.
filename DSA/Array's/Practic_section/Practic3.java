public class Practic3 {
    public static void main(String[] args) {
        // insertion 
        int[] arr = {22,11,33,54,52};
        int insertIndex = 2;
        int insertValue = 200;
        
        for(int i = arr.length-1; i >= insertIndex; i--){
            arr[i] = arr[i-1];
        }
        arr[insertIndex] = insertValue;

        for(int nums : arr){
            System.out.print(nums+" ");
        }

        // deletion value
              

    }
    
}
