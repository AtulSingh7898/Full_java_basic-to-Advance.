// Area of ractangle
class Rectangle{
    int height;
    int width;

    int areaOfRactangle(){
        return height*width;
    }
}
public class TestRactangle{
    public static void main(String args){
        Rectangle r = new Rectangle();
        System.out.println("THe area of ractangle "+r.areaOfRactangle());
    }
}
