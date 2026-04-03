package zPractic_section;

public class calculatore {
    
    int add(int a, int b){
        System.out.println("first");
        return (a+b);
    }
    double add(double a, double b){
        System.out.println("second");
        return (a+b);
    }

    public static void main(String[] args) {
        calculatore c = new calculatore();
        System.out.println(c.add(1, 2.2));
        System.out.println(c.add(1, 2));
    }
}
