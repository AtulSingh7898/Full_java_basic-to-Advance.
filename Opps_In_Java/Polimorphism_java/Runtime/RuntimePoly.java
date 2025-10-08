package Polimorphism_java.Runtime;
// Runtime polimorphis Mathod overriding 
class Animal{
    void makeSound(){
        System.out.println("THis is the animal ");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        super.makeSound();
        System.out.println("THis the dog method");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("THis the Cat method");
    }
}

public class RuntimePoly{
    public static void main(String[] args) {
        Animal a;
        // Refrence of parant class

        a = new Dog(); //object of Dog 
        a.makeSound();

        a = new Cat(); // object of Cat
        a.makeSound();


    }
}