public class MaxMin {
    public static int newarr(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }else if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {5,4,9,12};
        int arr1 = newarr(arr);
        System.out.println("The number is max in this arr " +arr1);
        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }else if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The number is manimum is "+min);
        System.out.println("The number is miximum is "+max); 
    }
}
