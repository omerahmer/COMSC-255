// Omer Ahmer, ID 2014063

package module6;

public class Assignment6 {
    public static void main(String[] args) {
        CDAccount[] cdAccounts = new CDAccount[5];

        Account.setAnnualInterestRate(3.0);

        for (int i = 0; i < cdAccounts.length; i++) {
            double balance = 1000.00 + i * 1000.00;
            int duration = (i + 1) * 3;  // 3, 6, 9, 12, 15 months
            cdAccounts[i] = new CDAccount(i + 1, balance, duration);
        }

        for (int i = 0; i < cdAccounts.length; i++) {
            System.out.println(cdAccounts[i].toString());
            cdAccounts[i].displayMonthlyInterests();
            cdAccounts[i].deposit(500.00);
            cdAccounts[i].withdraw(200.00);
            System.out.println("-------------------------------------------");
        }
    }
}