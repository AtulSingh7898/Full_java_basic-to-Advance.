import java.util.Arrays;

public class MoveZero {

    public static void main(String args[]){
        int arr[] = {0,1,0,3,12};
        int lastzero = 0; 
        for(int i = 0; i < arr.length; i++){
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[lastzero];
                arr[lastzero] = temp;
                lastzero++;

            }
        }

        System.out.println("Arr is "+Arrays.toString(arr));
    }
    
}
