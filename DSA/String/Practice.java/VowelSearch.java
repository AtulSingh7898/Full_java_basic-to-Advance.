public class VowelSearch {

    public static void main(String[] args){
        String str = "education";
        int countVowel = 0;
        for(char c : str.toCharArray()){
            if("aeiouAEIOU".indexOf(c) != -1){
                countVowel++;
            }
        }
        System.out.println(countVowel);
    }
}
