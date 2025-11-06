import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class Practic6 {
    public static void main(String args[]){

        int arr[] = {12,3,3,2,1,8,3,2,9,55,4,5,4,5,4,5,6,6,7,8};
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr){
            list.add(num);
        }
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(5);
        // list.add(7);
        // list.add(8);
        // list.add(6);
        // list.add(2);
        // list.add(9);
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println("The list is "+list);

        Set<Integer> unique = new HashSet<>();
        // Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for(int num : list){
            if(!unique.add(num)){
                duplicate.add(num);
            }
        }
        System.out.println("unique element "+unique);
        System.out.println("The list is "+duplicate);
        


        // 2d arr with linear search 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the row: ");
        // int row = sc.nextInt();
        // System.out.print("Enter the col: ");
        // int col = sc.nextInt();
        

        // int[][] arr = new int[row][col];
        // for(int i = 0; i < row; i++){
        //     for(int j = 0; j < col; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        // int target  = 34;
        // boolean found = false;
        // for(int i = 0; i < row; i++){
        //     for(int j = 0; j < col; j++){
        //         if(arr[i][j] == target){
        //             System.out.println("the target "+target+" is found in row"+"("+i+", "+j+")");
        //             found = true;
        //             break;

        //         }

        //         // System.out.print(arr[i][j]+" ");
        //     }
        //     if(found){
        //         break;
        //     }
        //     System.out.println();
        // }
        // if(!found){
        //     System.out.println("The target is not found in the arr ");
        // }
    }
    
}
