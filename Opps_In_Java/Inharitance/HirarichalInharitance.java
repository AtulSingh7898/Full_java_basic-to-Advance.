//Hirarichale Inharitance

import zPractic_section.Vehical;

class Vehical{
    protected String Fuel = "Patrol";
    void startVehical(){
        System.out.println("The Vehical is start");
    }
}

class Car extends Vehical{
    void CarModel(){
        System.out.println("Enter the Car started ");
    }
}
class Bike extends Vehical{
    void BikeModel(){
        System.out.println(" Bike started");
    }
}

public class HirarichalInharitance {
    public static void main(String[] args) {
        Car c = new Car();
        c.CarModel();
        c.startVehical();
        
        Bike B = new Bike();
        B.BikeModel();
        B.startVehical();


    }
    
    
}
