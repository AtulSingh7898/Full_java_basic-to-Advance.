
// Accessing the perivate mathod from another class


class secrete{
    private void revelsecrete(){
        System.out.println("The is the a Secrete Method ");
    }

    public void show(){
        revelsecrete();
    }
}

public class InnerSecrete {

    public static void main(String[] args) {
        secrete s = new secrete();
        s.show();
    }
    
}
