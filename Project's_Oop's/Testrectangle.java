class Recteangle{
    int length;
    int width;

    Recteangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    int CalculateArea(){
        return length*width;
    }
    void CalculateA(){
        System.out.println("The length is "+ length);
        System.out.println("the width is "+width);
    }

}
public class Testrectangle{
    public static void main(String args[]){
        Recteangle r = new Recteangle(45,45);
        r.CalculateA();
        System.out.println(r.CalculateArea());
    }
}