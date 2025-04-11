class Account{
     String name;
     double balance,interest;
     Account(){
        System.out.println("Default");
     }
     Account(String name,double balance,double interest){
        this.name = name;
        this.balance = balance;
        this.interest = interest;
     }
}
class SavingsAccount extends Account{
    SavingsAccount(){
        super();
        System.out.println("Default constructor");
    }
    SavingsAccount(String name,double balance,double interest){
        super(name,balance,interest);
    }
    double addInterest(){
        System.out.println("Interest added to account " + name);
        balance += balance * interest;
        return balance;
    }
    void displayBalance(){
        System.out.println("Account " + name + " balance: " + balance);
    }
    

}
class CheckingAccount extends Account{
    CheckingAccount(){
        super();
        System.out.println("Default Constructor");
    }
    CheckingAccount(String name,double balance,double interest){
        super(name, balance, interest);
    }
    double withdraw(double money){
        System.out.println("withdrew "+ balance + "from checking accoutn "+ name);
        balance -= money;
        return balance;
    }
    void displayBalance(){
        System.out.println("Account" + name + " balance " + balance);
    }
}
public class task10 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA001",1000.0, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount("CA001",500.0, 200.0);
        savingsAccount.displayBalance();
        savingsAccount.addInterest();
        savingsAccount.displayBalance();
        checkingAccount.displayBalance();
        checkingAccount.withdraw(700.0);
        checkingAccount.displayBalance();
    }
}
