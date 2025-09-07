public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== Animal Hierarchy ===");
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Kitty");

        dog.makeSound();
        cat.makeSound();

        Dog myDog = new Dog("Rocky");
        myDog.fetch();
        myDog.fetch("stick");

        System.out.println("\n=== Bank System ===");
        BankAccount savings = new SavingsAccount("S001", "Alice", 5000, 5.0);
        BankAccount current = new CurrentAccount("C001", "Bob", 2000, 1000);

        savings.deposit(1000);
        savings.withdraw(2000);

        ((SavingsAccount) savings).addInterest();

        System.out.println();
        current.deposit(500);
        current.withdraw(2500);
        current.withdraw(1000); 
    }
}
abstract class Animal {
    protected String name;

    public Animal(String name) {   // Constructor
        this.name = name;
    }
    public abstract void makeSound();   // Abstraction

    public String getName() {           // Encapsulation
        return name;
    }
}
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void makeSound() {  
        System.out.println(getName() + " says: Woof Woof!");
    }
    public void fetch() {
        System.out.println(getName() + " is fetching a ball.");
    }

    public void fetch(String item) {
        System.out.println(getName() + " is fetching a " + item + ".");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }
}
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accNo, String holder, double bal, double rate) {
        super(accNo, holder, bal);
        this.interestRate = rate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Savings. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings. New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance in Savings!");
        }
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest + ". New Balance: " + balance);
    }
}
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accNo, String holder, double bal, double limit) {
        super(accNo, holder, bal);
        this.overdraftLimit = limit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Current. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current. New Balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}
