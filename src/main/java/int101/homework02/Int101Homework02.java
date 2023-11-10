package int101.homework02;

import work01Utilitor.Utilitor;
import work02Person.Person;
import work03Account.Account;

public class Int101Homework02 {

    public static void main(String[] args) {
       work01Utilitor();
       work02Person();
       work03Account();
    }

    static void work01Utilitor() {
        System.out.println("1.2 testString : " + Utilitor.testString("Kritsada"));
        System.out.println("1.3 testPositive : " + Utilitor.testPositive(5));
        System.out.println("1.4 computeIsbn10 : " + Utilitor.computeIsbn10(1234567899));
    
    }

    static void work02Person() {
        Person person1 = new Person("Kritsada","Atchariyapruk");
        Person person2 = new Person("Kritsada","Atchariyapruk");
        System.out.println("2.6 constructor, 2.7 toString : " + person1.toString());
        System.out.println("2.6 constructor, 2.7 toString : " + person2.toString());
        System.out.println("2.8 getFirstname : " + person1.getFirstname());
        System.out.println("2.8 getLastname : " + person1.getLastname());
        person1.setFirstname("Atchariyapruk");
        person1.setLastname("Kritsada");
        System.out.println("2.9 setFirstname,setLastname : " + person1.toString());
        System.out.println("2.10 equals : " +person1.equals(person2));

        
    }

    static void work03Account() {
        Person person1 = new Person("Kritsada","Atchriyapruk");
        Account account1 = new Account(person1);
        Person person2 = new Person("Atchriyapruk","Kritsada");
        Account account2 = new Account(person2);
        System.out.println("3.6 constructor, 3.11 toString : " + account1.toString());
        System.out.println("3.6 constructor, 3.11 toString : " + account2.toString());
        System.out.println("3.7 getNo : " + account1.getNo());
        System.out.println("3.7 getBalance : " + account1.getBalance());
        System.out.println("3.8 deposit : " + account1.deposit(500));
        System.out.println("3.8 deposit : " + account2.deposit(500));
        System.out.println("3.9 withdraw : "  + account1.withdraw(100));
        System.out.println("3.9 withdraw : " + account2.withdraw(100));
        account1.transfer(100,account2);
        System.out.println("3.10 transfer : " + account1.toString());
        System.out.println("3.12 equals : "  +account1.equals(account2));
        
    }
}
