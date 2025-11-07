import java.util.ArrayList;

public class Practic0{
    public static void main(String args[]){
        //thirt largest element in arr
        int[] arr = {44,2,4,33,21,45,32,56,43};
        int first = 0;
        int seconde = 0;
        int third = 0; 
        for(int num : arr){
            if(first <num){
                third = seconde;
                seconde = first;
                first = num;
            }else if(num > seconde && first != num){
                third = seconde;
                seconde= num;
            }else if(num > third && seconde != num){
                third = num;
            }
        }
        System.out.println("The first largest number is "+first);
        System.out.println("The first largest number is "+ seconde);
        System.out.println("The third largs num is "+ third);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);

        list.add(2, 48);

        System.out.println("The list the  "+list);

    }
}
