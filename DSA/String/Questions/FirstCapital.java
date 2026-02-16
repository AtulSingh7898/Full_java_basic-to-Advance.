package Questions;

public class FirstCapital {
    static String FirstCapitalLetter(String str){
        if(str == null || str.isEmpty()){
            return str;
        }

        String words[] = str.trim().split(" ");
        StringBuilder result = new StringBuilder();
        for(String word : words){
            String capitalized = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
            result.append(capitalized).append(" ");
        }
        return result.toString().trim();
    }
    
    public static void main(String[] args) {
        String str = "First leTTeR of EACH Word";
        // FirstCapitalLetter("my country name is india");
        System.out.println(FirstCapitalLetter(str));
        
    }
    
}
