package Abstraction;
abstract class Animal{
    // abstract mathode
    abstract void sound();
    // concrete mathode
    void Breathe(){
        System.out.println("Breathing");
    }

}
    // the class dog is concrete class must implements abstract method
class dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}

public class TestAbstract{
    public static void main(String[] args) {
        // Animal a = new Animal() //you can not create object of abostrct class you can access the all data through of child class
        dog d = new dog();
        d.sound();
        d.Breathe();
    }

}
