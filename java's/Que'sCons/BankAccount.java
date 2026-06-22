class BankAccount {
    String customerName;
    double balance;
    String accountType;

    {
        accountType = "Savings";
        System.out.println("Account Initialization Started");
    }

    BankAccount() {
        this("Guest", 0);
    }

    BankAccount(String customerName) {
        this(customerName, 0);
    }

    BankAccount(String customerName, double balance) {
        this.customerName = customerName;
        this.balance = balance;

        System.out.println("Customer: " + this.customerName);
        System.out.println("Balance: " + this.balance);
        System.out.println("Account Type: " + accountType);
    }

    public static void main(String[] args) {
        new BankAccount();
        new BankAccount("Amit");
        new BankAccount("Amit", 5000);
    }
}