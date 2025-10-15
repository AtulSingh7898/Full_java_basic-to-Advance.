
// Final keyword in object Reference

public class Circle {

    final double PI = 3.145345;

    double radius;
    Circle (double radius){
        this.radius = radius;
        // this.PI = PI;
    }
    double area(){
        return radius*radius;
    }

    public static void main(String[] args) {
        Circle c= new Circle(10);
        System.out.println(c.area());
    }
    
}
