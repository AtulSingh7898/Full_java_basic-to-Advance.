// proteced access modifier


class Animal{
    protected String name = "Animal name";
    protected void sound(){
        System.out.println("This this the animal class ");
    }
}
class Cat extends Animal{
    String name = "Cat";
    void makeSound(){
        sound();
        System.out.println("This is the Cat class Accessed");
    }
    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.println("The name is animal "+c.name);
        c.makeSound();
    }
}

