//MultiLevel Inharitance


class GrantParant{

    protected String family = "Manihar Family";
    void showFamily(){
        System.out.println("We are the Manihar family:");
    }
}
class Parant extends GrantParant{
    void ShowParant(){
        System.out.println("This blong to parant Family member");
    }
}
class child extends Parant{
    void Showchild(){
        System.out.println("This blong to child member: ");
    }

    public static void main(String[] args) {
        child c = new child();
        c.Showchild();
        c.showFamily();
        c.ShowParant();
    }
}