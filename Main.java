import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        BankAccount account = new BankAccount(name);

        int choice = 0;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Show Transactions");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Deposit amount: ");
                    double d = sc.nextDouble();
                    account.deposit(d);
                    break;
                case 2:
                    System.out.print("Withdraw amount: ");
                    double w = sc.nextDouble();
                    account.withdraw(w);
                    break;
                case 3:
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 4:
                    account.printTransactions();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while(choice != 5);

        sc.close();
    }
}
