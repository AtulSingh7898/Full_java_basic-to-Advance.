package Leetcode;

import java.util.HashMap;

public class FindFirstUniqueEl {
    static char findFirstUnique(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        ;
        for(char c : str.toCharArray()){
//            System.out.println();
            System.out.println(map.getOrDefault(c,0)+1+"    "+c);
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(char c : str.toCharArray()){
            if(map.get(c) == 1){
                return c;
            }
        }
        return '\0';
    }
    public static void main(String[] args){
        String str = "AABJBDCCE";
        char firstUniqchar = findFirstUnique(str);

        if(firstUniqchar != '\0'){
            System.out.println("The first Uniqua Char is: "+firstUniqchar);
        }else{
            System.out.println("The Not Uniqua Char");
        }
    }
    
}
