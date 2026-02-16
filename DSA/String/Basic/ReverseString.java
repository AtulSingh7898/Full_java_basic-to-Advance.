package Basic;
public class ReverseString {
   static String reverseString(String str){
    String sum = "";
    // for(int i = str.length()-1; i >= 0; i--){
    //     // System.out.println(str.charAt(i));
    //     sum += str.charAt(i);
    // }
    char[] sum2 = str.toCharArray();
    int i = 0;
    int j = sum2.length-1;
    while(i <= j){
        char temp = sum2[i];
        sum2[i] = sum2[j];
        sum2[j] = temp;
        i++;
        j--;
    }
    
    return new String(sum2);
   }


   static String reverseString2(String str){
    if(str.isEmpty() || str.length() == 1){
        return str;
    }
    return reverseString(str.substring(1))+str.charAt(0);
   }

   static String reverseString3(String str){
    return new StringBuilder(str).reverse().toString();
   }
    public static void main(String[] args){
        String str = "Atul Singh";
        String st = reverseString(str);
        System.out.println(st);
        System.out.println(reverseString2(str));
        System.out.println(reverseString3(str));
    }
    
}
