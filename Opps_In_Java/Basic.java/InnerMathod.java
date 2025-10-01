class PrivateMathod{
    String name;
    int age;
    
    PrivateMathod(String name, int age){
        this.name = name;
        this.age = age;
    }
     void PrivateMathod(String name, int age){
        System.out.println("The Name is "+name);
        System.out.println("The age is "+age);
    }
    private void SecreteMathod(){
        System.out.println("This the secrete mathod");
    }
    void secretCall(){
        SecreteMathod();
    }
    void display(){
        System.out.println("The person name is: "+name);
        System.out.println("The Person age is: "+age);
    }
}

public class InnerMathod{
    public static void main(String arge[]){
        PrivateMathod p = new PrivateMathod("Thar", 21);
        // p.name = "Atul";
        // p.age = 22;
        p.display();
        // p.secretCall();
        // p.SecreteMathod;
    }
}