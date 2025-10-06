// Using protected it can access in the same package and different package

//singleIn consdition using recursion 

class Animal{

    protected String name = "Animal";

    public void makesound(){
        System.out.println("Animal Sound");
    }
}
public class Dog extends Animal{
    public void display(){
        System.out.println("Dog is a : "+name);
        makesound();
     }
    public static void main(String[] args) {
        Dog  d = new Dog();
        d.display();

        Animal a = new Animal();
        a.name = "Cow";
        System.out.println(a.name);
        // makesound();
    }
}