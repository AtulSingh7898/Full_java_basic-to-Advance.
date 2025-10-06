
// Accessing the perivate mathod from another class

class secrete{
    private void secreteclass(){
        System.out.println("This is the secreate class: ");
    }
    
    public void Publiclass(){
        secreteclass();
    }
}

public class InnerSecreteMathod{

    public static void main(String [] args){
        secrete sr = new secrete();
        sr.Publiclass();
    }
    
}

