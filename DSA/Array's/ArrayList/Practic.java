import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Practic{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);;
        list.add(20);
        list.add(40);
        list.add(22);
        list.add(20);

        // for(int i = 0; i < list.size(); i++){
        //     System.out.print(list.get(i)+" ");
        // }

        System.out.println(list.indexOf(20));
        System.out.println(list.lastIndexOf(20));
        
        // list.forEach(System.out::print);
        System.out.println("The lestest "+list);
        // list.lastIndexOf(30);
        System.out.println("The lestest "+list);
        
        // System.out.println("The list of item in the arraylist "+list);
        // System.out.println("The size of arr is "+list.size());
        // System.out.println("The list of item in the arraylist "+list);
        // System.out.println("The list of contains is "+list.contains(30));
        // System.out.println("The list of contains is "+list.contains(90));
        // // System.out.println("The list of arr is ");

        // list.remove(3);
        // System.out.println("The size of arr is "+list.size());
        // System.out.println("The list of item in the arraylist "+list);
        // System.out.println("The list of contains is "+list.contains(30));
        // System.out.println("The list of contains is "+list.contains(90));
        
        // //set is replace the value of element 
        // list.set(2, 50);
        // System.out.println("The size of arr is "+list.size());
        // System.out.println("The list of item in the arraylist "+list);
        // System.out.println("The list of contains is "+list.contains(30));
        // System.out.println("The list of contains is "+list.contains(90));

        // // list.add add the value in arr to choose index
        // list.add(2, 40);
        // System.out.println("The size of arr is "+list.size());
        // System.out.println("The list of item in the arraylist "+list);
        // System.out.println("The list of contains is "+list.contains(30));
        // System.out.println("The list of contains is "+list.contains(80));


        // list.clear();
        // System.out.println("The arr is? "+list.isEmpty());
        // //Arrays.isEmpty();


        // ArrayList<String> fruit = new ArrayList<>();
        // fruit.add("mongo");
        // fruit.add("orange");
        // fruit.add("evacado");
        // fruit.add("kive");
        // fruit.add("lichi");
        // fruit.add("dragonFruit");
        // System.out.println("The overAll fruit is "+fruit);
        // System.out.println("The size is "+fruit.size());


        // // using the iteratore 
        // Iterator<String> iterator = fruit.iterator();
        // while(iterator.hasNext()){
        //     System.out.print(iterator.next()+" ");
        // }

        // System.out.println();
        // //lemda experation
        // fruit.forEach(s-> System.out.print(s+" "));

        // // method reference scope resulation
        // fruit.forEach(System.out::println);

        // System.out.println();
        // ArrayList<Object> list1 = new ArrayList<>();
        // list1.add("Mango");
        // list1.add(0.4);
        // list1.add(true);
        // list1.add('a');
        // list1.add(10);
        // System.out.println("The list of Object: "+list1);

        // practic question


        //sum of number in the arr
        // int arr[] = {1,3,4,4,5,60};
        // int sum = 0;
        // for(int i = 0; i < arr.length; i++){
        //     sum += arr[i];
        // }
        // for(int num : arr){
        //     sum += num;
        // }
        // System.out.println(sum);

        //minimum and maximum number of array

        // int[] arr = {12,33,54,53,52,67,65,6};
        // int minNum = arr[0];
        // int maxnum = arr[0];

        // for(int num : arr){
        //     if(minNum < num) 
        //     minNum = num;
        //     if(maxnum>num)
        //     maxnum = num;
        // }
        // System.out.println("the maximum number is "+maxnum);
        // System.out.println("The minimum number is: "+minNum);

        int[] nums = {45,65,56,76,77};

        int i = 0, j = nums.length-1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        System.out.println("the array element is: "+Arrays.toString(nums));
        // Arrays.sort(nums);
        // System.out.println("the array element is: "+Arrays.toString(nums));
    }
}