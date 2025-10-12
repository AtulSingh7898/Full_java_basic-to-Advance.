package Interface;

interface Printable{
    void print();
}
interface Scaneable{
    void Scane();
}

class PrintScanner implements Printable, Scaneable{
    public void print(){
        System.out.println("Printing");
    }
    public void Scane(){
        System.out.println("Scannig");
    }
}

public class Mutipleinheritance{
    public static void main(String[] args) {
        PrintScanner sc = new PrintScanner();
        sc.print();
        sc.Scane();
    }
}