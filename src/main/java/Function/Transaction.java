package Function;

class Transaction {
    private String account;
    private double amount;

    public Transaction(String account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public String getAccount(){

        return account;
    }

    public double getAmount() {
        return amount;
    }
}