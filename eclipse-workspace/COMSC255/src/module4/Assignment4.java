// Omer Ahmer, ID 2014063

package module4;

public class Assignment4
{
    final static int number = 5;

	public static void main(String[] args)
	{
		Account.setAnnualInterestRate(0.03);
		Account[] accountArray = new Account[number];
		for (int i = 0; i < number; i++)
		{
			accountArray[i] = new Account(1000*(i+1), 1000.0*(i+1));
			accountArray[i].withdraw(500);
			accountArray[i].deposit(1000);
		}
		displayAccounts(accountArray);
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
