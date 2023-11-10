package work03Account;
import work01Utilitor.Utilitor;
import work02Person.Person;


public class Account {
     private static long nextNo = 1_000_000_000;
     private final long no;
     private Person owner;
     private double balance;
    
     //3.6
     public Account(Person owner){
         if(owner == null){
             throw new NullPointerException();
         }
        this.owner = owner;
        this.no = Utilitor.computeIsbn10(nextNo);
        nextNo += 10;
        this.balance = 0.0;
     }
     //3.7
     public long getNo() {
        return no;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
//    3.8
    public double deposit(double amount){
        if(amount != Utilitor.testPositive(amount)){
            throw new IllegalArgumentException();
        }
        return balance += amount;
    }
//    3.9
    public double withdraw(double amount){
         if(amount != Utilitor.testPositive(amount)){
            throw new IllegalArgumentException();
        }
         double newBalance = balance - amount;
         if(newBalance != Utilitor.testPositive(newBalance)){
             throw new IllegalArgumentException();
         }
        return newBalance;
                    
    }
//    3.10
    public void transfer(double amout,Account account){
        if(account == null){
            throw new IllegalArgumentException();
        }
        this.withdraw(amout);
        account.deposit(amout);
    }
//    3.11
    @Override
    public String toString() {
        return "Account(" + no + "," + balance + ")";
    }
//    3.12
     @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        return false;
    }
    
   

   

   
}
