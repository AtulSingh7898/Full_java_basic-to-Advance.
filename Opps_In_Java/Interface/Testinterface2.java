//interface with default and static mothds
package Interface;

interface Vehicle{

    //default mathod (Can be ovderridden)
    default void start(){ //veriabl is aready public final 
        System.out.println("Vehical started");

    }
    //static ,mathod: (belong to the intereface, not object)
    static void stop(){
        System.out.println("the vehical stoppeted");
    }

    // private mathod can we used only inside the interface

    private void interiorColor(){
        System.out.println("Cream color");
    }
}

class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car started.....");
    }
}

public class Testinterface2{
    public static void main(String[] args) {
      Car c = new Car();
      c.start();
      Vehicle.stop();
    }
}