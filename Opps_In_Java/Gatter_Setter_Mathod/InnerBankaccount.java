// Getter setter mathod

// encapsulation///////////////////////////////////
class Bankacount{
    private double balance;
    //setter
    public Bankacount(double balance){
        this.balance = balance;
    }
   // getter
    public double getBalance(){
        return balance;
    }

    public void diposit(double amount){
        if(amount > 0 ){
            balance += amount;
        }else{
            System.out.println("Invailid diposit ");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
        }else{
            System.out.println("Insufficent Balance");
        }
    }

}

public class InnerBankaccount{

    public static void main(String[] args) {
        Bankacount acount = new Bankacount(1000);
        acount.diposit(500);
        System.out.println("The Disposit after you balance is: "+ acount.getBalance());

        acount.withdraw(100);
        System.out.println("After withdrow you balace is: "+ acount.getBalance());

        acount.withdraw(2000);
        System.out.println("After withdrow you balace is: "+ acount.getBalance());
    }
}

