
public class AppearOnce {
//  26 Find the Element that Appears Only Once
//  Input: [2, 2, 1, 1, 4]
//  Output: 4
//  Explanation: The element that appearsonly once is 4.
    public static void main(String[] atul){
        
        int[] arr = {2, 2, 1, 1, 4};
        int first = 0;
        int mid = 0;
        int last  = 0;
        int k = 0;

        // for(int i = 0; i < arr.length;i++){
        //     if(k<1 || arr[i] != arr[k-1]){
        //         arr[k] = arr[i];
        //             k++;
        //     }
        // }
        // System.out.println(k);
        // System.out.println(Arrays.toString(arr));


        int count = 0;
        int result = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count == 0){
                result = arr[i];
            }
            count=0;
        }
        System.out.println(result);
        // while (first < arr.length){
        //     if(arr[first]==arr[mid+1]){
        //     }
        // }
    }
}
