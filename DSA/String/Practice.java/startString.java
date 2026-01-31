import java.util.Arrays;

public class startString {

    public static int sumOfAllNumber(String str){
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            char s = str.charAt(i);
            if(Character.isDigit(s)){
                sum += s -'0';
            }
        }

    
        char[] ch = str.toCharArray();
        for(char c : ch){
            System.out.println(c);
            sum += c - '0';
        }
        
        return sum;
    }


    public static void main(String[] args){
        String str = "12$hg2L6[91!8*4";
        int result = sumOfAllNumber(str);
        System.out.println(result);

        


    }
    
}
