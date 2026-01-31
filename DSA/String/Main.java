import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb  = new StringBuilder("Atul singh");
        sb.append(" Manihar");
        System.out.println(sb.toString());
        
        String str = "Sumar Singh";
        str = str.toUpperCase();
        System.out.println(str);

        str = str.toLowerCase();
        System.out.println(str);
        String name = "Sumar Singh";
        str.compareTo(name);

        boolean h = str.equals(name);
        System.out.println(h);

        System.out.println(name);
        // char[] s = str.toCharArray();
        // System.out.println(s.toString());

        // for(int i = 0; i < s.length; i++){
        //     System.out.println(s[i]);
        // }
        int[] atul = {'A','T','U','L'};
        System.out.println("Start count");
        int sum = 0;
        for(int n : atul){
            System.out.println(n);
            sum += n;
        }
        
        System.out.println(sum);

        String str2 = "Atul Singh";

        str2 = str2.concat(" Manihar");
        System.out.println(str2);

        String a = "java";
        String b = new String("java");
        System.out.println(a == b); //check with reference
        System.out.println(a.equals(b)); //true check by value 

        // String pool :- where inside the heap memory String are sorted
        String x = "Hello";
        String y = "Hello";
        // both point to same Object 

        String s = "java is very easy";
        String[] word = s.split(" ");
        System.out.println("After split "+Arrays.toString(word));
        System.out.println(s.replace(" ", " "));

        String st = "Atul";
        String st2 = "Atul";
        String st3 = "atul";
        String st4 = new String("Atul");
        String st5 = new String("Atul").intern();

        System.out.println("Compare 2-> "+ st.compareTo(st5));

        System.out.println("Equal to "+st.equals(st2));
        System.out.println("Equal to "+st.equals(st2));
        System.out.println("compareTo "+st3.equalsIgnoreCase(st));

        System.out.println("compareTo "+st.compareTo(st2));
        System.out.println("compareTo "+st3.compareTo(st));
        System.out.println("compareToignorecase "+st.compareToIgnoreCase(st3));
        System.out.println("compareToignorecase "+st2.compareToIgnoreCase(st3));
        
        String names = "my Names is atul singh";
        String[] splitWord = names.split(" ");
        System.out.println(Arrays.toString(splitWord));
        
        
    }
    
}
