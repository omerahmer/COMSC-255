// Omer Ahmer, ID 2014063

package module7;

import java.util.Date;

public class Account {
    private int id ;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    public Account() {
    	id = 0;
    	balance = 0.0;
    	annualInterestRate = 0.0;
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
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
    
    @Override
    public String toString() {
        return "Account ID: " + getID() + ", Balance: $" + String.format("%.2f", getBalance()); 
    }
    
    @Override
    public boolean equals(Object obj) {
    	if (!(obj instanceof Account) || obj == null) {
    		return false;
    	}
    	if (this == obj) {
    		return true;
    	}
    	
    	Account CD = (Account) obj;
    	return id == CD.id;
    }
    
}