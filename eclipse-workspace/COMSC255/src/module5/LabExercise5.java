package module5;

public class LabExercise5 {
	
	public static void main(String[] args) {
		Customer customer = new Customer("Omer Ahmer", "999 Maguire St");
		Customer customer2 = new Customer("Jeff Bezos", "123 Amazon Way");
	    customer.displayCustomerInfo();
	    customer2.displayCustomerInfo();
	        
	    Account account = new Account(customer, 1001, 5000.0);
	    Account account2 = new Account(customer2, 1002, 500000000.0);

	    account.addTransaction(1000.0, "Deposit");
	    account2.addTransaction(3500000, "Withdrawal");
	    
	    account.displayTransactionHistory();
	    account2.displayTransactionHistory();


	    System.out.println("Total Transactions: " + TransactionHistory.getTransactionCount());

	    System.out.println("Total Customers: " + Customer.getCustomerCount());
	}

    
    public static void displayAccounts(Account[] accounts)
	{
		System.out.printf("%15s%20s%20s%15s%25s\n", "Account Number", "Initial Balance", "Monthly Interest", "Balance", "Date Created");
		System.out.println("=====================================================================================================");
		for (int i = 0; i < accounts.length; i++)
		{
			System.out.printf("%15d%20.2f%20.2f%15.2f%30s\n", accounts[i].getID(), accounts[i].getBalance(), accounts[i].getMonthlyInterest(), accounts[i].getBalance()+ accounts[i].getMonthlyInterest(),  accounts[i].getDateCreated());
			accounts[i].setBalance(accounts[i].getBalance() + accounts[i].getMonthlyInterest());
		}
	}
    
}
