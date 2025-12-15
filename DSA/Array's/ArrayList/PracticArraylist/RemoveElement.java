package PracticArraylist;

import java.util.ArrayList;

public class RemoveElement {
    static ArrayList<Integer> removeEvenElement(ArrayList<Integer> list){
        
        for(int i = 0; i < 23; i++){
            list.add(i*i);
        }
        // ArrayList<Integer> list1 = removeEvenElement(list);
        System.out.println("Before delet element is "+list);
        for(int i = 0; i<list.size(); i++){
            if(i%2 == 0){
                list.remove(i);
            }
        }
        // System.out.println("After delet element is "+list);
        return list;
    }
    public static void main(String[] main){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = removeEvenElement(list);
        System.out.println(list1);
        // System.out.println("Before delet element is "+list);
        // for(int i = 0; i<list.size(); i++){
        //     if(i%2 == 0){
        //         list.remove(i);
        //     }
        // }
        // System.out.println("After delet element is "+list);
        
    }
    
}
