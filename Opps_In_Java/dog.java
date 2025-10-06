class animal{
    protected String name = "Animal";

    public void makeSound(){
        System.out.println("The Animal sound is: ");
    }
}

class dog extends animal{
    public void display(){
        System.out.println("The can is a "+name);
        makeSound();
    }

    public static void main(String[] args) {
        dog d = new dog();
        d.display();

        animal a = new animal();
        // a.name = "Seroo";
        a.makeSound();
    }
}