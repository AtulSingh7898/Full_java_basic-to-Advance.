package ArrayList;

public class ExpandArrays {
    public static void main(String[] args){
        int[] arr = {10,20,30};
        
        int[] arrNew = new int[arr.length*2];

        for(int i = 0; i < arr.length; i++){
            arrNew[i] = arr[i];
        }
        arrNew[3] = 40;
        arrNew[4] = 50;
        arrNew[5] = 60;

        arr = arrNew;

        // for(int i = 0; i< arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
        for(int i = 0; i< 6; i++){
            System.out.print(arr[i]+" ");
        }


        int [] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }

        int[] newNumber = new int[numbers.length*2];
        newNumber[3] = 40;
        newNumber[4] = 50;
        newNumber[5] = 60;

        numbers = newNumber;
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println(numbers.length);

        for (int i = 0; i < newNumber.length; i++) {
            System.out.print(newNumber[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 6; i++) {
            System.out.print(newNumber[i] + " ");
            //array omdex out of bound
        }
    

    }
    
}
