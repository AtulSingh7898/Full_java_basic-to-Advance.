package Protected;

// Protected access modifier

class Animal {
    protected String name = "Tiger";
    protected void sound(){
        System.out.println("Hello");
    }
}

class Bird extends Animal{
    void makeSound(){
        sound();
        System.out.println("Bird class access");
    }
}

public class ProtectedModifier{
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println("the name is "+a.name);
        a.sound();

        Bird b = new Bird();
        System.out.println("the tiger access through bird class  "+b.name);
        b.sound();
        b.makeSound();
    }
}