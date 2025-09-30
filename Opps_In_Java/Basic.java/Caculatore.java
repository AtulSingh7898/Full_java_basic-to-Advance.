// Constructore chaining

public class Caculatore{
    int num1;
    int num2;

    Caculatore(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    int add(){
        return num1+num2;
    }
    int Subtraction(){
        return num1 - num2;
    }
    int multiplaction(){
        return num1*num2;
    }
    double division(){
        if(num2 == 0) {
            System.out.println("The Number is zero: ");
            return Double.NaN;
        }
        return num1/num2;
    }
    // void display(){
    //     System.out.println("The Add Of Num1+Num2 "+(num1+num2));
    //     System.out.println("The Subtract Of Num1+Num2 "+(num1-num2));
    //     System.out.println("The MultiplayOf Num1+Num2 "+(num1*num2));
    //     System.out.println("The Divid Of Num1+Num2 "+(num1/num2));
    // }

    public static void main(String[] args) {
        Caculatore Calulate = new Caculatore(20, 5);
        System.out.println(Calulate.add());
        System.out.println(Calulate.Subtraction());
        System.out.println(Calulate.multiplaction());
        System.out.println(Calulate.division());
    }
}