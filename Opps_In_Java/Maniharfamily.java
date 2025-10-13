interface Mummy{
    void arun();
    void veera();
}
interface papa{
    void atul();
}

class MummyPapa implements Mummy, papa{
    public void arun(){
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
        Parant.arun();
        Parant.veera();
        Parant.atul();
    }
}