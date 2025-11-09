import java.util.ArrayList;
import java.util.Iterator;

public class Practic7 {
    public static void main(String[] args){
        //expand arr
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(60);
        list.add(10);
        list.add(70);
        list.add(10);
        list.add(80);

        list.add(2, 30);
        System.out.println("THe list is "+list);
        System.out.println("the get item in the list "+list.get(4));
        System.out.println("the size of list is "+ list.size());
        System.out.println("THe check their of "+list.contains(10));
        System.out.println("THe check their of "+list.contains(300));
        System.out.println("THe check of occurance of list "+list.indexOf(10));
        System.out.println("THe check of occurance of list "+list.lastIndexOf(10));
        System.out.println("Th list is empty "+list.isEmpty());

        list.set(3, 90);
        System.out.println("THe list is "+list);
        System.out.println("the size of list is "+ list.size());
        System.out.println("THe check their of "+list.contains(10));
        System.out.println("THe check their of "+list.contains(300));
        System.out.println("THe check of occurance of list "+list.indexOf(10));
        System.out.println("THe check of occurance of list "+list.lastIndexOf(10));
        System.out.println("Th list is empty "+list.isEmpty());

        list.remove(2);
        System.out.println("After remove element of list "+list);
        System.out.println("the size of list is "+ list.size());
        System.out.println("THe check their of "+list.contains(10));
        System.out.println("THe check their of "+list.contains(300));
        System.out.println("THe check of occurance of list "+list.indexOf(10));
        System.out.println("THe check of occurance of list "+list.lastIndexOf(10));
        System.out.println("Th list is empty "+list.isEmpty());

        System.out.println("The list is : ");
        for(int i = 0; i <list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println();
        list.clear();
        System.out.println("Th list is empty "+list.isEmpty());

        System.out.println("The iteratore method using in fuction ");
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Evacado");
        fruit.add("lichi");
        fruit.add("Pineapple");
        fruit.add("Drogen fruit");

        Iterator<String> iterator = fruit.iterator();
        for (String string : fruit) {
        }
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        // lemda fuction expression
        fruit.forEach(s-> System.out.print(s+" "));

        //
        fruit.forEach(System.out::println);
         ArrayList<Object> AllObj = new ArrayList<>();
        AllObj.add("Apple");
        AllObj.add(10);
        AllObj.add(34.2);
        AllObj.add('a');
        AllObj.add(40);
        AllObj.add("Drogen fruit");

        AllObj.forEach(System.out::println);
    }
    
}
