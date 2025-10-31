// Returning array from method

public class Passingarr{
    static int[] creatArr(int size){
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = i+1;
        }
        return arr;
    }

    static boolean initialArr(int[] arr, int key){
        for(int i = 0; i <arr.length; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {

        int[] arr1 = {22,3,44,55};
        boolean check = initialArr(arr1, 4);
        System.out.print(check);
        System.out.println();

        int[] arr = creatArr(5);
        for (int nums : arr) {
            System.out.print(nums+" ");
        }
    }


}