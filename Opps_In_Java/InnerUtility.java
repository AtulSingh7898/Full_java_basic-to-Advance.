class Utility{

    private Utility(){
        System.out.println("This is the private class consutructor Utility");
    }
    

    public static int square(int x){
       return x*x;
    }

    public static void display(){
        System.out.println("This the mathod of using utility class");
    }
}


public class InnerUtility{
    public static void main(String[] args) {
        System.out.println("The Square of any number: "+ Utility.square(4));
        Utility.display();
    }
    
}