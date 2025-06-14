
// Refactor for Long Method
// Original method was too long and handled multiple responsibilities
// Solution: Break it into showMenu() and handleTransaction()

import java.util.Scanner;

public class TransactionMenuRefactored {
    private Scanner scanner = new Scanner(System.in);
    private Account account = new Account();

    public void transactionMenu() {
        showMenu();
        int choice = scanner.nextInt();
        handleTransaction(choice);
    }

    private void showMenu() {
        System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
    }

    private void handleTransaction(int choice) {
        switch (choice) {
            case 1: handleDeposit(); break;
            case 2: handleWithdraw(); break;
            case 3: System.out.println("Balance: " + account.getBalance()); break;
            case 4: System.exit(0); break;
        }
    }

    private void handleDeposit() {
        System.out.print("Enter amount to deposit: ");
        double deposit = scanner.nextDouble();
        account.deposit(deposit);
    }

    private void handleWithdraw() {
        System.out.print("Enter amount to withdraw: ");
        double withdraw = scanner.nextDouble();
        account.withdraw(withdraw);
    }
}

class Account {
    private double balance = 0;

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }
    public double getBalance() { return balance; }
}
