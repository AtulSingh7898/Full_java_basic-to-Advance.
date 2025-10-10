package Statickeyword;
public class Statickey {
    int y = 78;
    static String name = "Atul";

    public void main(int y){
        this.y = y;
    }
    public static void main(String[] args) {

        Statickey obj = new Statickey();
        System.out.println("This is my number "+obj.y);
        System.out.println("This is my Name "+ name);

    }
}
