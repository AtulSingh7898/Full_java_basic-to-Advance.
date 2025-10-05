
//Private Constructor :Sigelton or Ristricted

class Utility{

    private Utility(){
        System.out.println("This the private Utility Construtor ");
    }

    public static int square (int x){
        return x*x;
    }

    public static void display(){
        System.out.println("The is hellow  Form utility class ");
    }
}
public class Singleton {
    public static void main(String[] args) {
        System.out.println("The Square is : "+ Utility.square(4));
        Utility.display();
    }
}
