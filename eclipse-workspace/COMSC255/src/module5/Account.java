// Omer Ahmer, ID 2014063

package module5;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    private Customer customer;
    private TransactionHistory[] transactionHistory;
    private int transactionCount;

    public Account(Customer customer, int id, double balance) {
        this.customer = customer;
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactionHistory = new TransactionHistory[100];
        transactionCount = 0;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addTransaction(double amount, String description) {
        TransactionHistory transaction = new TransactionHistory(amount, description);
        transactionHistory[transactionCount++] = transaction;
    }

    public void displayTransactionHistory() {
        System.out.println("Transaction History for Account ID: " + id);
        for (int i = 0; i < transactionCount; i++) {
            transactionHistory[i].displayTransaction();
            System.out.println("----------");
        }
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double InterestRate) {
        annualInterestRate = InterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

}