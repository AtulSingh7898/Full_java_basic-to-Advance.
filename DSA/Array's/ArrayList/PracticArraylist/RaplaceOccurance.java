package PracticArraylist;

// 3. Update an element
// Replace all occurrences of "apple" with "orange" in an ArrayList

import java.util.ArrayList;

public class RaplaceOccurance {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("avacado");
        list.add("droganFruit");
        list.add("apple");
        list.add("lichi");
        list.add("apple");
        list.add("Strawarry");
        list.add("apple");

        for(int i = 0; i<list.size(); i++){
            if(list.get(i).equals("apple")){
                list.set(i, "orange");
            }
        }
        System.out.println(list);

    }
}
