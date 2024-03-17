package module2;
import java.util.Scanner;

public class LabExercise2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter loan amount:");
		int loanAmount = scanner.nextInt();
		
		System.out.print("Enter loan period:");
		double loanPeriod = scanner.nextDouble();
		
        System.out.printf("%20s%20s%20s\n", "Interest Rate (%)", "Monthly Payment ($)", "Total Payment ($)");
				
		for (int i = 0; i < 25; i++) {
			double monthlyInterest = ((i*0.125)+5)/100/12;
			double monthlyPayment = (loanAmount*monthlyInterest)/(1-(1/(Math.pow(1+monthlyInterest, loanPeriod*12))));
			double totalPayment = monthlyPayment*loanPeriod*12;
            System.out.printf("%20.3f%20.2f%20.2f\n", monthlyInterest*100*12, monthlyPayment, totalPayment);
        }
	}
}
