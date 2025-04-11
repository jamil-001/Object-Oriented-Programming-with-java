class BankAccount{
      int Accoutnumber;
      double balance;
      //account + balance
      BankAccount(int Accoutnumber,double balance){
        this.Accoutnumber = Accoutnumber;
        this.balance = balance;
      }
      //just account number
      BankAccount(int Accoutnumber){
        this.Accoutnumber = Accoutnumber;
        this.balance = 0.0;
      }
      
      //default
      BankAccount(){
        this.Accoutnumber = 0;
        this.balance = 0.0;
      }

      void display(){
        System.out.println("Account Number: " + Accoutnumber);
        System.out.println("Blance: $" + balance);
      }
}
public class task10 {

    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount(231115140,2000.0);
        BankAccount obj2 = new BankAccount(231115140);
        BankAccount obj4 = new BankAccount();
        obj1.display();
        System.out.println();
        obj2.display();
        System.out.println();
        obj4.display();
    }
}