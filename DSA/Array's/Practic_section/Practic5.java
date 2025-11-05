import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;

public class Practic5{
    public static void main(String args[]){

        ArrayList<Object> allObj = new ArrayList<>();
        allObj.add("Atul");
        allObj.add(10);
        allObj.add(true);
        allObj.add(5.4);
        allObj.add('a');

        System.out.println("The all element is ");
        allObj.forEach(System.out::println);
        

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Mango");
        fruit.add("orange");
        fruit.add("Avacado");
        fruit.add("Dragab fruit");
        fruit.add("lichi");
        fruit.add("kivi");

        Iterator<String> iterator = fruit.iterator();
        //hasNext check the value to exist then print next number
        System.out.println("The fruit is ");
        while(iterator.hasNext()){
            System.out.print(iterator.next()+", ");
        }

        // using lemda Expression
        fruit.forEach(fr -> System.out.println(fr));

        // print using mathod referance 
        fruit.forEach(System.out::println);

        // forEach(f-> System.out.println(f));

        // arrlist 
        // ArrayList<Integer> list = new ArrayList<>();

        // // add the element with sequence without index
        // list.add(10);
        // list.add(20);
        // list.add(20);
        // list.add(20);
        // list.add(40);
        // list.add(50);
        // list.add(20);
        // list.add(20);

        // System.out.println("this list is "+list);
        // System.out.println("THe size of list is "+list.size());

        // // add the element in the arraylist via index 
        // list.add(2, 30);
        // System.out.println("this list is "+list);
        // System.out.println("THe size of list is "+list.size());

        // // remove the element in the arraylist via index 
        // list.remove(4);
        // System.out.println("this list is "+list);
        // System.out.println("THe size of list is "+list.size());
        // //contains mean the element exist in arrlist if yes so give true if no so give false value like boolean value
        // System.out.println("the constains is "+list.contains(20));
        // System.out.println("the constains is "+list.contains(30));

        // // get the element is 
        // System.out.println("The get the element "+list.get(5));
        // System.out.println("this list is "+list);
        // System.out.println("THe size of list is "+list.size());

        // // replace the value of an array list 
        // list.set(3, 10);
        // System.out.println("this list is "+list);
        // System.out.println("THe size of list is "+list.size());

        // //occurance is check in the array list get the index 
        // System.out.println("The occurance index is "+list.indexOf(20));
        // System.out.println("The occurance index is "+list.lastIndexOf(20));
        
        // System.out.println("the list using foreach loop ");
        // for(int num : list){
        //     System.out.print(num+" ");
        // }

        // System.out.println();
        // list.clear();
        // System.out.println("The list is "+list);
        // System.out.println("The list is empty "+list.isEmpty());


    }
}