class BankAccount {

    private String accountHolder;
    private double balance;
    private double withdrawAmount;

    public void setAccountHolder(String name) {
        accountHolder = name;
    }

    public void setBalance(double bal) {
        balance = bal;
    }

    public void setWithdrawAmount(double amount) {
        withdrawAmount = amount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getRemainingBalance() {

        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
        } else {
            System.out.println("Insufficient Balance");
        }

        return balance;
    }
}

public class BankWithdrawal {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.setAccountHolder("Harsh");
        b.setBalance(10000);
        b.setWithdrawAmount(3000);

        System.out.println("Account Holder : " + b.getAccountHolder());
        System.out.println("Remaining Balance : " + b.getRemainingBalance());
    }
}