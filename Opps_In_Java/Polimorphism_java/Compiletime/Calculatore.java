package Polimorphism_java.Compiletime;
//Run time Polymorphysm  
public class Calculatore { //Mathod overloading
    int add(int a, int b){
        return a+b;
    }
    double add(double a, int b){
        return a-b;
    }
    int add(int a, int b, int c){
        return a*b*c;
    }
    double add(double a, double b ){
        return a/b;
    }

    public static void main(String args[]){
        Calculatore c = new Calculatore();
        System.out.println("This is total number of: "+ c.add(10, 05));
        System.out.println("This is total number of:" + c.add(10.43, 05));
        System.out.println("This is total number of: "+ c.add(10, 05,5));
        System.out.println("This is total number of: "+ c.add(10.32,5.23));
    }

}
