package module5;

import java.util.Date;

public class TransactionHistory {
    private double amount;
    private Date date;
    private String description;
    private static int transactionCount = 0;

    public TransactionHistory(double amount, String description) {
        this.amount = amount;
        this.date = new Date();
        this.description = description;
        transactionCount++;
    }

    public void displayTransaction() {
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date);
        System.out.println("Description: " + description);
    }

    public static int getTransactionCount() {
        return transactionCount;
    }
}
