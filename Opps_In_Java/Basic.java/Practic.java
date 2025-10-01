public class Practic {
    //Oject over loading 
    int length;
    int breath;

     void practic(){
        System.out.println("The lenght and breath is "+ length*breath);
    }

    public static void main(String args[]){
        Practic obj = new Practic();
        obj.length = 4;
        obj.breath = 3;
        obj.practic();

        Practic obj1 = new Practic();
        obj1.length = 4;
        obj1.breath = 32;
        obj1.practic();

        Practic obj2 = new Practic();
        obj2.length = 12;
        obj2.breath = 32;
        obj2.practic();

        Practic obj3 = new Practic();
        obj3.length = 4;
        obj3.breath = 34;
        obj3.practic();

    }
}
