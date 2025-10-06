class Vehicle{
    String brand = "Mercedes";
}



 class Car extends Vehicle {
    String brand = "Tesla";

    void displayBrand(){
        System.out.println("child class car brand is : "+brand);
        System.out.println("The Parant class car brand is:"+ super.brand);
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.displayBrand();
    }
    
}
