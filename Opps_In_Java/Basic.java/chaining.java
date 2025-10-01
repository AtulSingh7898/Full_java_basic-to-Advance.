public class chaining{
    String name;
    int num;
    String Enrollment;
    
    chaining(){
        this("unknow");
    }

    chaining(String name){
        this("unknow", 12);
        System.out.println("The first construter");
    }
    chaining(String name, int num){
        this("unknow ",0, "unknow");
        System.out.println("The second costructore");
    }
    chaining(String name , int num, String Enrollment){
        this.name = name;
        this.num = num;
        this.Enrollment = Enrollment;
    }

    void show(){
        System.out.println("the Name of Person "+name);
        System.out.println("The numebr is Person "+num);
        // System.out.println("The Enrollment Number "+Enrollment);
    }

    public static void main(String args[]){
        chaining ch = new chaining();
        ch.show();
        chaining ch1 = new chaining("atul",01);
        ch1.show();
        chaining ch2 = new chaining("Nikki", 25235, "oi32jejr");
        ch2.show();
    }
}