public class Oparater {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        //Arithmetic Oparater
        System.out.println("Arithmatic Oparater");
        System.out.println("a+b = "+ (a+b));
        System.out.println("a*b = "+ (a*b));
        System.out.println("a-b = "+ (a+b));
        System.out.println("a/b = "+ (a/b));
        System.out.println("a%b = "+ (a%b));
        System.out.println();

        //Raletion oparater
        // int a = 10;
        // int b = 5;
        System.out.println("Raletional Oparater");
        System.out.println("a==b = "+ (a==b));
        System.out.println("a!=b = "+ (a!=b));
        System.out.println("a>=b = "+ (a>=b));
        System.out.println("a<=b = "+ (a<=b));
        System.out.println("a<b = "+ (a<b));
        System.out.println("a>b = "+ (a>b));
        System.out.println();

        //logical Oparater
        System.out.print("logical Oparater");
        boolean x = true, y = false;
        System.out.println("x && y: "+ (x && y));
        System.out.println("x || y: "+ (x || y));
        System.out.println("!x: "+ (!x));
        System.out.println("!y: "+ (!y));
        System.out.println();

        //Bitwiswe Oparater
        int c = 5;
        int d = 3;
        System.out.println("Bitwise Oparater");
        System.out.println("c&d= "+(c&d));
        System.out.println("c|d= "+(c|d));
        System.out.println("c^d= "+(c^d));
        System.out.println("~c= "+(~c));
        System.out.println();

        //Assignment Oparater
        int e = 10;
        System.out.println("Assignment Oparater");
        System.out.println("Enitial Value of e "+ e);
        e += 5;
        System.out.println("After e += 5: "+ e);
        e *= 2;
        System.out.println("After e *= 2: "+ e);
        System.out.println();

        //Increment And Decrement Oparater
        int f = 5;
        System.out.println("Increment And Decrement Oparater");
        System.out.println("Ential Value of  f "+ f);
        System.out.println("Pre increment op.: "+ ++f);
        System.out.println("Post increment op.: "+f++);
        System.out.println("Pre decrement op.: "+ --f);
        System.out.println("Pre increment op.: "+f--);


        
    }
}
