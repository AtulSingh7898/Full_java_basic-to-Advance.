public class arraysize {
    public static void main(String[] args) {
        // int[] arr = { 10, 20, 30 };

        // int newsize  = arr.length*2;

        // int[] newArray = new int[newsize];

        // for (int i = 0; i < newArray.length; i++) {
        //     newArray[i] = arr[i];

        // }
        // newArray[3] = 40;
        // newArray[4] = 50;
        // newArray[5] = 50;

        // arr = newArray;
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]+" ");
        // }

        int[] arr = {10, 20, 30};

        // Let's say we want to double the size of arr
        // int newSize = arr.length * 2;
        int[] newArray = new int[arr.length*2];

        // Copy elements from old array to new array
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }

        // Add new elements
        newArray[3] = 40;
        newArray[4] = 50;
        newArray[5] = 60;

        // Point arr to the new array
        arr = newArray;

        // Print the new array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    




        // int [] numbers = new int[3];
        // int numbers[] = {10,20,30};
        // numbers[0] = 10;
        // numbers[1] = 20;
        // numbers[2] = 30;
        // System.out.println(numbers.length);
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.print(numbers[i]+ " ");
        // }

        // int[] newNumber = new int[numbers.length*2];
        // newNumber[3] = 40;
        // newNumber[4] = 50;
        // newNumber[5] = 60;

        // numbers = newNumber;
        // System.out.println();
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.print(numbers[i] + " ");
        // }
        // System.out.println();
        // System.out.println(numbers.length);

        // for (int i = 0; i < newNumber.length; i++) {
        // System.out.println(newNumber[i] + " ");
        // }
        // System.out.println();

        // for (int i = 0; i < 6; i++) {
        // System.out.println(newNumber[i] + " ");
        // //array omdex out of bound
        // }

    }
}