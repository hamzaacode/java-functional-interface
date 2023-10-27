package Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class CalculateFinancialTransactions {
    public static void main(String[] args) {
        // Create a list of financial transactions
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("Account1", 1000.0));
        transactions.add(new Transaction("Account2", 1500.0));
        transactions.add(new Transaction("Account1", 500.0));
        transactions.add(new Transaction("Account3", 2000.0));

        // Define a Function to extract the transaction amount
        Function<Transaction, Double> extractAmount = Transaction::getAmount;

        // Calculate the total balance for a specific account using the Function
        String accountToCalculate = "Account1";
        double totalBalance = calculateTotalBalance(transactions, accountToCalculate, extractAmount);

        System.out.println("Total balance for " + accountToCalculate + ": $" + totalBalance);
    }

    // Method to calculate the total balance for a specific account using a Function
    public static double calculateTotalBalance(List<Transaction> transactions, String account, Function<Transaction, Double> extractor) {
        double total = 0.0;
        for (Transaction transaction : transactions) {
            if (transaction.getAccount().equals(account)) {
                total += extractor.apply(transaction);
            }
        }
        return total;
    }
}
