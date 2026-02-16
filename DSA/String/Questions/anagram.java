package Questions;

import java.util.HashSet;

public class anagram {
    static boolean anagramQuestion(String str, String str1){
        str = str.toLowerCase();
        str1 = str1.toLowerCase();
        int count = 0;
        char ch[]  = str.toCharArray();
        char ch1[] = str1.toCharArray();
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < str.length(); j++){
                if(ch[i] == ch1[j]){
                    count++;
                } 
            }
        }
        if(count == str.length()){
            return true;
        }
        return false;
    }

    static boolean anagramQuestion2(String str, String str1){
        if(str.length() != str1.length()){
            return false;
        }
        str = str.toLowerCase();
        str1 = str1.toLowerCase();
        int[] count = new int[256];
        for(int i = 0; i < str.length(); i++){
            count[str.charAt(i)]++;
            count[str1.charAt(i)]--;

        }
        for(int c : count){
            if(c != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] srgs){
        String str = "listen";
        String str1 = "Silent";
        System.out.println(anagramQuestion(str, str1));
        System.out.println(anagramQuestion2(str, str1));
    }
}
