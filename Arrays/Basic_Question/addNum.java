package Basic_Question;
public class addNum {
    public static void main(String[] args){
        int[] arr = {4,1,2,3,4,5,6};

        // int result = 1;
        // for(int i = 0; i < arr.length; i++){
        //     result *= arr[i];
        // }
        // System.out.println("total number of arr "+result);

        //reverse array // odd even // count odd even 
        String even = "";
        String odd = "";
        int counte = 0;
        int counto = 0;

        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
            if(arr[i]%2 == 0){
                even = arr[i]+even;
                counte++;

            }else{
                odd = arr[i]+odd;
                counto++;
            }
        }
        System.out.println();
        System.out.println("count even Number "+counte);
        System.out.println("count odd Number "+counto);


        System.out.println("The even number of arr "+even);
        System.out.println("The odd number of arr "+odd);
        
    }
    
}
