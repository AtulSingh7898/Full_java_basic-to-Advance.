package zPractic_section;

// copy constructor

public class Main {
    int id;
    String name;

    Main(int id, String name){
        this.id = id;
        this.name = name;
    }
    Main(Main original){
        this.id = original.id;
        this.name = original.name;
    }
    void copyConstructor(){
        System.out.println("The id "+id+" and name of person "+name);
    }
    public static void main(String args[]){
        Main obj = new Main(1,"Atul");
        Main obj2 = new Main(obj);

        obj.copyConstructor();
        obj2.copyConstructor();

        

    }
    
}
