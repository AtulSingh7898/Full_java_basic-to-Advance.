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

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i = 0; i< 6; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        int [] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        // System.out.println(numbers[0]);
        // System.out.println(numbers[1]);
        // System.out.println(numbers[2]);

        int[] newNumber = new int[numbers.length*2];
        for (int i = 0; i < numbers.length; i++) {
            newNumber[i] = numbers[i];
        }
        System.out.println();
        newNumber[3] = 40;
        newNumber[4] = 50;
        newNumber[5] = 60;

        for (int i = 0; i < newNumber.length; i++) {
            System.out.print(newNumber[i] + " ");
            
        }

        numbers = newNumber;
        System.out.println();
        System.out.println("the size of arr is ");
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
