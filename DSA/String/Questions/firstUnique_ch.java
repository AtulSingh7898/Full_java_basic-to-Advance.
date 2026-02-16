package Questions;


public class firstUnique_ch {
    static char firstUniqCharacter(String str){
        // char[] ch = str.toCharArray();
        
        for(int j= 0; j < str.length(); j++){
            char c = str.charAt(j);
            int count = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == c){
                    count++;
                }
            }
            if(count == 1){
                return c;
            }
        }


        // for(int i = 0; i < str.length(); i++){
        //     if(ch[0] == str.charAt(i)){
        //         count++;
        //     }
        // }
        // if(count == 1){
        //     return true;
        // }
        return '\0';
    }
    public static void main(String[] args){
        String str = "swiss";
        System.out.println(firstUniqCharacter(str));

    }
}
