// Access superclass Feild


class Vehical{
    String Brand = "Mercedese";
    // void Brand(){
    //     System.out.println("This is the brand class");
    // }
}

public class Car1 extends Vehical{
    String Brand = "Tesla";
    void CarBrand(){
        System.out.println("The car brand is "+Brand);
        System.out.println("The parant brand is: "+super.Brand);
    }
    public static void main(String[] args) {
        Car1 c = new Car1();
        c.CarBrand();
    }
}