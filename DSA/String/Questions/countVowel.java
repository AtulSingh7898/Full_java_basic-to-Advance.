package Questions;

import java.util.HashSet;

public class countVowel {
    static int countVowels(String str){
        int count = 0;
        str = str.toLowerCase().trim();
        // for(int i = 0; i < str.length()-1; i++){
        //     if('a' == str.charAt(i) || 'a' == str.charAt(i)  || 'a' == str.charAt(i)  || 'a' == str.charAt(i)  ){

        //     }
        // }

        HashSet <Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        for(int i = 0; i < str.length(); i++){
            if(set.contains(str.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String str = "Hello World";
        System.out.println(countVowels(str));
        
        
    }
    
}
