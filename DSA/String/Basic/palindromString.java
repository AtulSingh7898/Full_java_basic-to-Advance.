package Basic;

public class palindromString {
    static boolean palidromStrings2(String str){
        str = str.toLowerCase().trim();
        
        return false;
    }

    static boolean palidromStrings(String str){
    //    int i = 0;
    //    int j = str.length()-1;
       char ch[] = str.toCharArray();

       String result = "";
       for(int i = str.length()-1; i>= 0; i--){
        result+= str.charAt(i);
       }
       if(result.equals(str)){
        return true;
       }
       return false;
    }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(palidromStrings(str));
    }
    
}
