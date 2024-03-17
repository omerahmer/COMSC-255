// Name: Omer Ahmer, ID: 2014063

package module2;
import javax.swing.JOptionPane;

public class Assignment2 {

    public static void main(String[] args) {
        while (true) {
            String amountStr = JOptionPane.showInputDialog(null, "Enter loan amount ($):", "Assignment 2", JOptionPane.INFORMATION_MESSAGE);
            String yearStr = JOptionPane.showInputDialog(null, "Enter loan duration (years):", "Assignment 2", JOptionPane.INFORMATION_MESSAGE);

            if (amountStr == null || yearStr == null) {
                System.exit(0);
            }

            if (!amountStr.isEmpty() && !yearStr.isEmpty()) {
                double amount;
                int year;
                amount = Double.parseDouble(amountStr);
                year = Integer.parseInt(yearStr);

                int confirmation = JOptionPane.showConfirmDialog(null, "Loan Amount: $" + amount + "\nLoan Duration: " + year + " years\nIs this information correct?", "Assignment 2", JOptionPane.YES_NO_CANCEL_OPTION);

                if (confirmation == JOptionPane.YES_OPTION) {
                	String display_msg = String.format("%25s", "Interest Rate(%)") +  String.format("%25s", "Monthly Payment($)") + String.format("%25s", "Total Payment($)") + "\n";
                    for (double rate = 5.0; rate <= 8.0; rate += 0.125) {
                        double monthlyInterestRate = rate / 1200.0;
                        int numberOfPayments = year * 12;

                        double loanAmount = amount;
                        double denominator = Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1;
                        double loanTerm = Math.pow(1 + monthlyInterestRate, numberOfPayments);

                        double monthlyPayment = loanAmount * monthlyInterestRate * loanTerm / denominator;
                        double totalPayment = monthlyPayment * numberOfPayments;

                        display_msg += String.format("%25.3f %25.2f %25.2f\n", rate, monthlyPayment, totalPayment);
                    }

                    JOptionPane.showMessageDialog(null, display_msg, "Assignment 2", JOptionPane.INFORMATION_MESSAGE);
                } else if (confirmation == JOptionPane.CANCEL_OPTION) {
                    System.exit(0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter valid numbers.", "Assignment 2", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
