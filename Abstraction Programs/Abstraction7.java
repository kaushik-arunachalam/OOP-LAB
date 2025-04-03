abstract class Account {
    abstract void accountType();

    void showBalance() {
        System.out.println("Showing account balance...");
    }
}

class SavingsAccount extends Account {
    void accountType() {
        System.out.println("This is a Savings Account");
    }
}

public class Abstraction7 {
    public static void main(String[] args) {
        Account myAccount = new SavingsAccount();
        myAccount.accountType();
        myAccount.showBalance();
    }
}
