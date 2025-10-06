// super keyword most improtant as a constructor

class Animal{
    
    Animal(String type){
        System.out.println("This a animal type"+ type);
    }
}
class Cat extends Animal{
    Cat(){
        super("cat");
        System.out.println("Cat constructore got called ");
    }

    public static void main(String[] args) {
        Animal a = new Animal("Dog");
        Cat c = new Cat();

    }
}

// superkey each time We write First othewise compile time on given error