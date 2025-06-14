
// Refactor for Feature Envy
// Original method accessed too many fields from Account class
// Solution: Move print logic into Account class

public class AccountFeatureRefactored {
    public static void main(String[] args) {
        Account acc = new Account("Ade", 500000);
        acc.printInfo();
    }
}

class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void printInfo() {
        System.out.println("Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}
