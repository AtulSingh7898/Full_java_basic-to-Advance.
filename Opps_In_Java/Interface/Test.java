package Interface;

// intereface abstract mathode

interface canFly {

    int MAX_SPEED = 200;
    //abstract method
    void fly();
}

class Drone implements canFly{
    public void fly(){
        System.out.println("Drone is flying at speed: "+MAX_SPEED);
    }
}

public class Testinterface{}

