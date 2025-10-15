// proteced access modifier

// Inheritance
 abstract class Animal{
    // protected String name = "Animal name";
    // if write the abstract any before mathod so ensure that is must be implement -
    //-in child class same mathod otherwise it can give the error give the example like that
   abstract void newSound();
    protected void sound(){
        System.out.println("This this the animal class ");
    }
}
class Cat extends Animal{

    void newSound(){
        System.out.println("The sound is Quack...");
    }
    String name = "Cat";
    void makeSound(){
        sound();
        System.out.println("This is the Cat class Accessed");
    }
    public static void main(String[] args) {
        //Animal a = new Animal();
        Cat c = new Cat();
        System.out.println("The name is animal "+c.name);
        c.makeSound();
        c.newSound();
    }
}

