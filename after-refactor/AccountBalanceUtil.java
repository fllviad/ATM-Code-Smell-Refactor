
// Refactor for Duplicate Code
// Original code printed balance in multiple places
// Solution: Create a utility method

public class AccountBalanceUtil {
    public static void main(String[] args) {
        Account account = new Account(100000);
        printBalance(account);
        // use again
        printBalance(account);
    }

    public static void printBalance(Account account) {
        System.out.println("Balance: " + account.getBalance());
    }
}

class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
