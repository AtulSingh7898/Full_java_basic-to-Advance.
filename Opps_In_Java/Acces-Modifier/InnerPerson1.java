class Person2{
    
    String name;
    int num;

    Person2(String name, int num){
        this.name = name;
        this.num =  num;
        System.out.println("the Name is "+name);
        System.out.println("The age is "+num);
    }
    private void secretemathod(){
        System.out.println("The mothod is secrete Mathode");
    }

    public void secretCall(){
        secretemathod();
    }

    void display(){
        System.out.println("The Name of Person: "+name);
        System.out.println("The Numebr of Person: "+num);
    }

    
}
public class InnerPerson1{
    public static void main(String[] args) {
        Person2 p1 = new Person2("Sing", 12);
        // p1.display();
        // p1.secretCall();
        
    }
}