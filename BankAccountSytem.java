import java.util.ArrayList;

public class BankAccount {
    private String name;
    private double balance;
    private ArrayList<String> transactions;

    public BankAccount(String name) {
        this.name = name;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if(amount <= balance){
            balance -= amount;
            transactions.add("Withdrew: " + amount);
        } else {
            transactions.add("Failed withdraw: " + amount);
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactions() {
        System.out.println("Transaction history for " + name + ":");
        for(String t : transactions){
            System.out.println(t);
        }
    }

    public String getName() {
        return name;
    }
}
