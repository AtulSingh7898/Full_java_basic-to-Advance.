// super keyword most improtant as a constructor Using parant Constructor

import Statickeyword.Animal;
import Statickeyword.Cat;

class Animal{
    Animal(String type){
        System.out.println("The animal is "+ type);
    }
}

class Cat extends Animal{
    Cat(){
        super("Cat");
        System.out.println("The cat constructor is called");
    }
    public static void main(String[] args) {
        Animal A = new Animal("Dog");
        Cat c = new Cat();
    }
} 