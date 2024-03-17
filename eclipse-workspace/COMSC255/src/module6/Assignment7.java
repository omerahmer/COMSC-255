// Omer Ahmer ID 2014063

package module6;

import java.util.Random;

public class Assignment7 {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            if (random.nextBoolean()) {
                accounts[i] = new Account(1001 + i, random.nextDouble() * 5000); 
            } else {
                accounts[i] = new CDAccount(1001 + i, random.nextDouble() * 5000, random.nextInt(24) + 6);
            }
        }
        
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i]); 
            accounts[i].withdraw(500);
            accounts[i].deposit(1000);
        }
        
        System.out.println("\nAfter Transactions:"); 
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i]); 
        }
        
        System.out.println("END OF PROGRAM ---------------------");
 
    }
}