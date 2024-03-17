// Omer Ahmer, ID 2014063

package module7;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assignment7 {
	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Account> accounts = new ArrayList<Account>();
		
		for (int i = 0; i < 100; i++) {
			double initialBalance = rand.nextDouble(1000.0);
			int period = rand.nextInt(144);
			
			if (rand.nextBoolean()) {
				accounts.add(new Account(1001 + i, initialBalance));
			}
			else {
				accounts.add(new CDAccount(1001 + i, initialBalance, period));
			}
		}
		
		Collections.shuffle(accounts);
		
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("Please enter an account number to check the balance (0 to exit): ");
			int id = s.nextInt();
			if (id == 0) {
				break;
			}
			int index = accounts.indexOf(new Account(id, 0));
			if (index == -1) {
				System.out.println("Account not found. Please try again.");
			}
			else {
				Account foundAccount = accounts.get(index);
				if (foundAccount instanceof CDAccount) {
					System.out.println("Account ID: " + ((CDAccount) foundAccount).getID() + ", Account Type: CDAccount, " + 
							"Matural Balance: " + String.format("%.02f", ((CDAccount) foundAccount).getMatureBalance()));
				}
				else if (foundAccount instanceof Account) {
					System.out.println("Account ID: " + foundAccount.getID() + ", Account Type: Account, " + "Balance: " + 
							String.format("%.02f", foundAccount.getBalance()));
				}
			}
		}
	}
}
