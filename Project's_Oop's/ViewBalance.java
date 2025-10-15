class BankingSystem{
    private double balance;
    String Holder_name;
    int accountNumber;

    public BankingSystem(double balance , String Holder_name, int accountNumber){
        this.balance = balance;
        this.Holder_name = Holder_name;
        this.accountNumber = accountNumber;
    }
    
    //get balance
    double getBalance(){
        return balance;
    }
    public void diposite(double amount){
        if(balance > 0){
            balance += amount;
        }else{
            System.out.println("This is not dipositable");
        }
    }

    public void withdrow(double amount){
        if(balance >= amount && balance > 0){
            balance -= amount;
        }else{
            System.out.println("This is the not possible to withdrow amount");
        }
    }

    void AccountDetail(){
        System.out.println("The name of holder name is "+ Holder_name);
        System.out.println("The account Number is "+accountNumber);
    }

    

}

class SavingAccount extends BankingSystem{
   
    public SavingAccount(double balance , String Holder_name, int accountNumber){
        super(balance , Holder_name, accountNumber);
    }
}
class CheckingAccount extends BankingSystem{
    public CheckingAccount(double balance , String Holder_name, int accountNumber){
        super(balance , Holder_name, accountNumber);
    }
}

public class ViewBalance{
    public static void main(String args[]){
        SavingAccount s = new SavingAccount(12000.44,"singh",343434353);
        s.AccountDetail();

        System.out.println("THe totale balance is "+s.getBalance());
        s.diposite(100);
        System.out.println("The disposit total balance is "+s.getBalance());
        s.withdrow(200);
        System.out.println("After widthdrow amount is "+s.getBalance());
    }
}
