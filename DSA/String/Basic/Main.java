package DSA.String.Basic;

public class Main {
    static void reverse(String Atul){
        // int i = 0; int j = Atul;
        // while(i <= j){
        //     String temp = Atul[i];
        //     Atul[i] = Atul[j];
        //     Atul[j] = temp;
        //     i++;
        //     j--;
        // }

        // return 'l';
    }
    public static void main(String[] args){
        
        char[] Atul = {'A','t','u','l'};
        String greating = "Atul singh Manihar";
        StringBuilder Str = new StringBuilder(greating);
        Str.reverse();

        
        // reverse(greating);
        System.out.println(greating);

        // System.out.println(Atul);
        // reverse(Atul);
        // System.out.println(Atul);
    
    }
}
