// single lever inharitance

class Animal {
    protected String name = "Animal";

    public void makeSound() {
        System.out.println("Animal Sound");
    }


}

class Dog extends Animal {
    public void display(){
        System.out.println("Dog name is : "+ name);
        makeSound();
    }
    public static void main(String[] args) {
        Dog d=new Dog();
        d.display();

        Animal a=new Animal();
        a.makeSound();
        System.out.println(a.name);

    }

    
}