public class arraysize{
    public static void main(String[] args){
        int[] arr = {10,20,30};

        int[] newArray = new int[arr.length];
        for(int i = 0; i< (arr.length*2); i++){
            newArray[i] = arr[i];
        }
        newArray[3]=40;
        newArray[4]=50;
        newArray[5]=50;

        arr = newArray;

       for(int i = 0; i< (arr.length*2); i++){
            newArray[i] = arr[i];
        }

    }
}