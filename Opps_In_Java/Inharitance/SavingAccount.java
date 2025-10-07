class BankAccount{

    double balance = 1000;

    void Showbalance(){
        System.out.println("the  Account balance is: "+balance);
    }

}

// superkey each time We write First othewise compile time on given error

public class SavingAccount extends BankAccount{
    void account(){

        System.out.println("the number is over all system: ");
        super.Showbalance();
    }
    public static void main(String[] args) {
        SavingAccount  AtulkAAccount = new SavingAccount();
        AtulkAAccount.account();
        BankAccount ac = new BankAccount();
        
    }
}
