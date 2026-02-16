package Basic;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// String Methods:
//  - charAt() : Returns the character at a specified index.
//  - length() : Returns the length of the string.
//  - substring() : Returns a substring of the string.
//  - toUpperCase() : Converts the string to uppercase.
//  - toLowerCase() : Converts the string to lowercase.
//  - trim() : Removes leading and trailing witeSpace.

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

        System.out.println("First char of name is: "+ names.charAt(0));
        String replaceNames=names.replace("my", "i'm");
        System.out.println("after replace the other "+replaceNames);


    //    String builder String Buffer 
    //    Strings in are immutable (cannot be changed). StringBuilder and StringBuffer provide mutable alternatives.
    //  - StringBuilder vs. StringBuffer:
    //  - StringBuilder is not thread-safe but faster, whereas StringBuffer is thread-safe but slower.
    //  - Performance Implications:
    //  - Use StringBuilder for single-threaded scenarios requiring better performance.
    //  - Use StringBuffer for multi-threaded scenarios where thread safety is essential.

    // String Builder

    StringBuilder sb1 = new StringBuilder();
    sb1.append("Hellow");
    sb1.append("");
    sb1.append(" World!");
    System.out.println("The length of StringBuilder is: "+sb1.length());
    System.out.println("the first char in stringBuilder is: "+sb1.charAt(0));
    System.out.println("The Last char in StringBuilder -> "+sb1.charAt(sb1.length()-1));

    System.out.println(sb1.lastIndexOf("d"));;
    System.out.println("The StringBuilder is first append: "+sb1);
    
    // How to use Inter with String class object 
    String sp = "hello";
    String sp1 = new String("hello").intern();
    System.out.println(sp.equals(sp1));

    // Regular Expression -> 
    String Email = "maniharatul@gmai.com";
    Pattern pattern = Pattern.compile("\\b[\\w.%-]+@[\\w.-]+\\.[a-zA-Z]{2,4}\\b");
    Matcher matcher = pattern.matcher(Email);
    boolean isEmail = matcher.find();
    System.out.println(isEmail);
    
    
    
    }
}
