package Interface;

interface Printable{
    void print();
}
interface Scaneable{
    void Scane();
}

class PrintScanner implements Printable, Scaneable{
    void print(){
        System.out.println("Printing");
    }
    void Scane(){
        System.out.println("Printing");
    }
}

public class Mutipleinheritance{
    PrintScanner sc = new PrintScanner();
    sc.print();
    sc.Scane();
}