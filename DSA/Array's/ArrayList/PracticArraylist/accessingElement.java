package PracticArraylist;

import java.util.ArrayList;

public class accessingElement {
    public static void main(String[] args){
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 1; i<=10; i++){
            list.add(i*2);
        }

        int n = list.size();
        for(int i = 0; i<n; i++){
            if(i == 0|| i == n/2 || i == list.size()-1){
                System.out.println(list.get(i));
            }
        }
    }
}
