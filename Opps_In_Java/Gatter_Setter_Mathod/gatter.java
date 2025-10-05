

//Getter

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

    public void withdraw(){
        if(amount > 0 && balance >= amount){
            balance -= amount;
        }else{
            System.out.println("Invalid");
        }
    }
}
