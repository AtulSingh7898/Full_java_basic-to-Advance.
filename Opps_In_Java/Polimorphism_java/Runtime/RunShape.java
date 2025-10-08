package Polimorphism_java.Runtime;

class Shape {
    void draw() {
        System.out.println("Drawing");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing Trinagle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class RunShape {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Triangle();
        shapes[1] = new Square();
        for (Shape s : shapes) {
            s.draw();
        }
    }

}
