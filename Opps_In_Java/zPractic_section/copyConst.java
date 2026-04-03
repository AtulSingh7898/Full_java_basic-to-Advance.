package zPractic_section;

public class copyConst {
    String name;
    int id;

    copyConst(String name, int id){
        this.name = name;
        this.id = id;
    }

    copyConst(copyConst original){
        this.name = original.name;
        this.id = original.id;
    }

    void copyConstructore(){
        System.out.println("The name is "+name+" and id is "+id);
    }

    public static void main(String[] args) {
        copyConst obj = new copyConst("atul",2);
        copyConst obj1 = new copyConst(obj);
        obj.copyConstructore();
        obj1.copyConstructore();
    }
    
}
