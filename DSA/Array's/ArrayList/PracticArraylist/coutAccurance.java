package PracticArraylist;
import java.util.ArrayList;

public class coutAccurance {
    static int countArrayList(ArrayList<Integer> list){
        for(int i = 0; i <=20; i++){
            if(i%2 == 0){
                list.add(2);
            }else{
                list.add(i);
            }
        }
        System.out.println(list);
        System.out.println(list.size());
        int count = 0;
        for(int j = 0; j <= list.size(); j+=1){
            if(!list.contains(j)){
                // list.add(j);
            }else{
                count++;
            }
        }
        System.out.println(list);
        System.out.println(count);
        
        return count;
    }

    public static void main(String[] atul){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <=20; i++){
            if(i%2 == 0){
                list.add(2);
            }else{
                list.add(i);
            }
        }
        System.out.println(list);
        System.out.println(list.size());
        int count = 0;
        for(int j = 0; j <= list.size(); j+=1){
            if(list.contains(j)){
                count++;
            }
        }
        System.out.println(list);
        System.out.println(count);
        int List2 = countArrayList(list);
        System.out.println(List2);
    }
    
}
