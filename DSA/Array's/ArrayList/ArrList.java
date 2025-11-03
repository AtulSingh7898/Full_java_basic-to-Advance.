// package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();

        // // add the element int the list 
        // list.add(10);
        // list.add(20);
        // list.add(20);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(20);

        // System.out.println("The list is: "+list);
        // System.out.println("the size of arr is "+list.size());
        // System.out.println("The is element 30 is there? "+list.contains(30));
        // System.out.println("The is element 20 is there? "+list.contains(20));

        // // add the element int the list with index
        // list.add(2, 40);
        // System.out.println("The list is: "+list);
        // System.out.println("the size of arr is "+list.size());
        // System.out.println("The is element 30 is there? "+list.contains(30));
        // System.out.println("The is element 20 is there? "+list.contains(20));
        // System.out.println("The list is empty? "+list.isEmpty());

        // //set the value with replace of list element 
        // list.set(2, 45);
        // System.out.println("The list is: "+list);
        // System.out.println("the size of arr is "+list.size());
        // System.out.println("The is element 30 is there? "+list.contains(30));
        // System.out.println("The is element 20 is there? "+list.contains(20));
        // System.out.println("The list is empty?: "+list.isEmpty());

        // // remove the element of list through of index
        // list.remove(2);
        // System.out.println("The list is: "+list);
        // System.out.println("the size of arr is "+list.size());
        // System.out.println("The is element 30 is there? "+list.contains(30));
        // System.out.println("The is element 20 is there? "+list.contains(20));
        // System.out.println("The list is empty?: "+list.isEmpty());

        // // clear overall lilst of item's

        // list.clear();
        // System.out.println("The list is: "+list);
        // System.out.println("the size of arr is "+list.size());
        // System.out.println("The is element 30 is there? "+list.contains(30));
        // System.out.println("The is element 20 is there? "+list.contains(20));
        // System.out.println("The list is empty?: "+list.isEmpty());


        // printing using iteretor
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("mongo");
        fruit.add("orang");
        fruit.add("charry");
        fruit.add("avacado");
        fruit.add("chivi");
        fruit.add("lichi");

        // System.out.println("The fruit is : "+fruit);
        // Iterator<String> iterator = fruit.iterator();
        // while (iterator.hasNext()) {
        //     System.out.print(iterator.next()+" ");
        // }

        // Print using lemda exprassion
        // fruit.forEach(f-> System.out.println(f));

        // mathod reference scope resulation
        // fruit.forEach(System.out::println);

        ArrayList<Object> list = new ArrayList<>();
        list.add("mongo");
        list.add(7);
        list.add(4);
        list.add(true);
        list.add('a');
        list.add(10.9);

        System.out.println("The list is "+list);
        // list.forEach(System.out::println);



    }
    
}
