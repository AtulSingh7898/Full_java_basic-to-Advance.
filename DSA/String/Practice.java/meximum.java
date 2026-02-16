public class meximum {
    public static void main(String[] args){
        String str = "1(#@2*%3%5^6*4";
        int sum = 0;
        char[] ch = str.toCharArray();
        for(char c : ch){
            if(Character.isDigit(c)){
                sum += c-'0';
            }
        }
        System.out.println(sum);
    }
}
