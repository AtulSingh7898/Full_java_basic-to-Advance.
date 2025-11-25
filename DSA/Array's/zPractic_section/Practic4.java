import java.util.Arrays;

public class Practic4 {
    static int[] createArray(int size){
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }
        return arr;
    }
    static void PassArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 0){
                System.out.print(" "+ arr[i]);
            }
        }
    }

    public static void main(String args[]){

        //Passing the array inside the mathod
        int[] arr = {12,33,42,52,55,44,32};
        PassArray(arr);

        //create array in the mathod
        // int[] arr = createArray(5);
        // System.out.println("The element of the arrays is "+Arrays.toString(arr));

        // int[] arr = {1,2,3,4,5,4,7,8,9}; // arr litrall's
        // arr[arr.length-4] = 6;

        // System.out.println("The size of arr "+arr.length);
        // System.out.println("The element of arr "+Arrays.toString(arr));
        // System.out.println("The last elemnt of arr "+arr[arr.length-1]);
        
        
        // Arrays.sort(arr);
        // System.out.println("sorted arr "+Arrays.toString(arr));

        // insertion inset the value in index through of indice

        // int indexinsert = 5;
        // int valueinsert = 6;

        // for(int i = arr.length-1; i >indexinsert; i--){
        //     arr[i] = arr[i-1];
        // }
        // arr[indexinsert] = valueinsert;

        // for(int nums : arr){
        //     System.out.print(nums+" ");
        // }

        // delete the value in the arr

        // int deletindex = 5;
        // for(int i = deletindex; i < arr.length-1; i++){
        //     arr[i] = arr[i+1];
        // }
        // arr[arr.length-1] = 0;
        // for(int nums : arr){
        //     System.out.print(nums+" ");
        // }

        // declare and initialization of arr
        // int[] arr = new int[5];
        // Object[] arr = new Object[5]; // everything put any type of value true of object initialize keyword
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }

        // for(int i = 0; i< arr.length; i++){
        //     arr[i] = 10;
        // }

        // arr[0] = 10;
        // arr[1] = 10;
        // arr[2] = 10;
        // arr[3] = 10;
        // arr[4] = 10;

        // arr[0] = "atul";
        // arr[1] = 10.2;
        // arr[2] = true;
        // arr[3] = 'A';
        // arr[4] = 10;



        // System.out.println();
        // for(int i = 0; i< arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }

        // copy arr 
        // int[] arr = {10,12,35,23,54,22};
        // int[] copyArray = Arrays.copyOf(arr, arr.length);
        // System.out.println("The lenght of copy array "+Arrays.toString(copyArray));

        // try catch topic of Exception handling 
        // int arr[] = {1,2,3,4,5};
        // int index = 7;
        // try{
        //     System.out.print("the index "+index+" have the element of "+arr[index]);
        // }catch(Exception e){
        //     System.out.print("error "+e.getMessage());
        // }

        // without using try catch 
        // int[] arr = {1,24,44,54,34,56,1};
        // int index = 4;
        // if(index >= 0 && index < arr.length){
        //     System.out.print("The index "+index+" in the element of "+arr[index]);
        // }else{
        //     System.out.print("the index "+index+" out of bound for length "+ (arr.length));
        // }

        // int[] num= {12,33,34,54,55,64};
        // boolean found = false;
        // int foundelement = 15;
        // for(int i = 0; i < num.length; i++){
        //     if(num[i] == foundelement){
        //         System.out.println("Found the number is "+num[i]);
        //         found = true;
        //         break;
        //     }
        // }
        // if(!found){
        //     System.out.println("we can't found the number "+foundelement);
        // }

        // copy arr 

        // int[] arr = {20,12,32,30,34,40};

        // binarySearch return the index of array 
        // int index =  Arrays.binarySearch(arr, 32);
        // System.out.println("The find the index is "+index);

        // usorted arr 
        // int[] copyArrays = Arrays.copyOf(arr, arr.length);
        // System.out.println("The is element is "+Arrays.toString(copyArrays));

        // int[] fillArray = new int[5];
        // Arrays.fill(fillArray, -1);
        // System.out.println("the fill arr element is "+Arrays.toString(fillArray));

        // copy array with range 
        // int[] copyRandArr = Arrays.copyOfRange(copyArrays, 1, 5);
        // System.out.println("The range of arr is "+Arrays.toString(copyRandArr));
        
        // sorted arr 
        // Arrays.sort(arr);
        // System.out.println("The sorted arrays is "+Arrays.toString(arr));

        // int[] arr = {1,2,3};
        // int[] arr1 = {1,2,3};
        // int [] arr2 = new int[]{1,2,3};

        // boolean checkFirstArr = arr == arr1;
        // boolean checkFirstArr2 = arr == arr2;
        // //double equals check the reference(address) compareing;
        // System.out.println("The check the arr and arr1 use == "+checkFirstArr);
        // System.out.println("The check the arr and arr2 use == "+checkFirstArr2);
        // // arrays.equale only check the value compareing
        // System.out.println("The the element of arr and arr1 use equals "+ Arrays.equals(arr, arr1));
        // System.out.println("The the element of arr and arr2 use equals "+ Arrays.equals(arr, arr2));


        // String str = "atul";
        // String str1 = "atul";
        // String str3 = " Manihar";
        // // str = str3;
        // System.out.println(str+str3);

        // String str2 = new String( "atul");

        // boolean checkFirststr = str == str1;
        // boolean checkFirststr2 = str == str2;
        // //double equals check the reference(address) compareing;
        // System.out.println("The check the str and str1 use == "+checkFirststr);
        // System.out.println("The check the str and str2 use == "+checkFirststr2);
        // // strays.equale only check the value compareing
        // System.out.println("The the element of str and str1 use equals "+ str.equals(str1));
        // System.out.println("The the element of str and str2 use equals "+ str.equals(str2));

    }
    
}
