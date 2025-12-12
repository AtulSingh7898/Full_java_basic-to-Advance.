package PracticArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class printArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the input size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Element int the list: ");
        for(int i = 0; i < n; i++){
            // list.get(i) = sc.nextInt();
            arr[i] = sc.nextInt();
        }

        for(int nums:arr){
            list.add(nums);
        }

        System.out.println("Your Element list is "+list);
    }
    
}
