package Statickeyword;

public class Student {
    int rollNo;
    String name;
    static String college  = "Army instatitut of technology";

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    void display(){
        System.out.println("This My RollNUmber is "+rollNo);
        System.out.println("THis my name is "+name);
        System.out.println("My COllage name is "+college);
    }

    public static void main(String[] args) {
        Student obj = new Student(12, "Atul");
        Student obj2 = new Student(13, "newsome");

        Student.college = "IIT";
        obj.display();
        obj2.display();
    }

}
