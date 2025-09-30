// Constructore chaining

public class constructorechaning {
    int num1;
    int num2;

    constructorechaning(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    int add(){
        return num1+num2; 
    }

    int subtraction(){
        return num1-num2;
    }
    int multiplaction(){
        return num1*num2;
    }

    double divid(){
        if(num2 == 0){
            System.out.println("THe nuebr is");
            return Double.NaN;
        }
        return num1+num2;
        
    }

    public static void main(String[] args) {
        constructorechaning chaining = new constructorechaning(20, 5);
        
        int Addition = chaining.add();
        System.out.println("THe 2 Number of Addition "+Addition);
        int subtraction = chaining.subtraction();
        System.out.println("THe 2 Number of subtraction "+subtraction);
        int multiplaction = chaining.multiplaction();
        System.out.println("THe 2 Number of multiplaction "+multiplaction);
        double divid = chaining.divid();
        System.out.println("THe 2 Number of Divid "+divid);
    }

}
