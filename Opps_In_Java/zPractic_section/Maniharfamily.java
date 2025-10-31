package zPractic_section;

interface Mummy{
    int FamilyMember = 5;
    void arun();
    void veera();
}
interface papa{
    void atul();
}

class MummyPapa implements Mummy, papa{
    public void arun(){
        System.out.println("The family mamber is "+ FamilyMember);
        System.out.println("Arun is son On Manihar Family");
    }
    public void veera(){
        System.out.println("Veera is Doughter On Manihar Family");
    }
    public void atul(){
        System.out.println("Atul is son On Manihar Family");
    }
}

public class Maniharfamily{
    public static void main(String[] args) {
        MummyPapa Parant = new MummyPapa();
        // System.out.println(Parant.familyMember);
        Parant.arun();
        Parant.veera();
        Parant.atul();
    }
}