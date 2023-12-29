class Bank {
    private double balance;
    public Bank(double OBalance){
        balance = OBalance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

    public void display(){
        System.out.println("The Balance in your account is:" +balance);
    }
}
class BankApp{
    public static void main(String[] args){
        Bank b1= new Bank(100.00);

        System.out.println("Your balance before transaction is:");
        b1.display();

        b1.deposit(24.00);
        b1.withdraw(26.00);

        System.out.println("Your balance after transaction is:");
        b1.display();
    }
}