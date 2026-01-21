

// import java.awt.im.InputContext;
import java.util.HashMap;


public class Practic {

    public static char findUniquChar(String input){
        HashMap <Character, Integer> charCount = new HashMap<>();
        for(char c: input.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0)+1);

        }

        for(char c: input.toCharArray()){
            if(charCount.get(c)  == 1){
                return c;
            }

        }
        

        return '\0';
    }
    public static void main(String[] args){
        String str = "AABBITTG";
        char firstUnique = findUniquChar(str);
        // System.out.println(firstUnique);

        if(firstUnique != '\0'){
            System.out.println("The first unique character is: "+firstUnique);
        }else{
            System.out.println("the no uniqua is ");
        }
        
    }
    
}
