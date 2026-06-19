package classesandobjects;
class BankAccount {
    private String accountHolder;
    private double balance;
    private double withdrawAmount;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
        } else {
            System.out.println("Insufficient balance");
        }
        return balance;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setAccountHolder("Amit");
        b.setBalance(10000);
        b.setWithdrawAmount(3000);

        System.out.println("Account Holder: " + b.getAccountHolder());
        System.out.println("Remaining Balance: " + b.getBalance());
    }
}