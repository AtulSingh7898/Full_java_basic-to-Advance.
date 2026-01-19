package Practic;

import java.util.HashMap;
import java.util.Map;




public class Practic{
    public static char SearchFirstUniqueChar(char[] arr){
        HashMap <Character, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(int i = 0; i<arr.length; i++){
            if(map.get(arr[i]) == 1){
                return arr[i];
            }
        }
        return '0';
    }
    public static void main(String[] args){
        char[] arr = {'a','a','m','m','i','t','t','g'};
        System.out.println(SearchFirstUniqueChar(arr));
        

    }

}