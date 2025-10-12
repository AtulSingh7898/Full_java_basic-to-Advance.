public class Perfact{
    int age = 12;
    static String name = "Atul";
    void display(){
        System.out.println("this my name "+name+" this is my age "+age);
    }

    public static void main(String args[]){
        Perfact p = new Perfact();
        // p.name = "fuction";
        p.display();
    }
}