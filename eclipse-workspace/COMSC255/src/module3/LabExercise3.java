// Omer Ahmer ID 2014063

package module3;

public class LabExercise3 {
	
	public static void main(String[] args) {
		System.out.print("Enter a positive number: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		double number = input.nextDouble();
		System.out.println("The square root for " + number + " is " + sqrt(number));
		input.close();
	}
	
	public static double sqrt(double number) {
		// Find the square root of the value
		// Apply the Babylonian method to find the square root of number
		// and return the value
		double lastGuess = 1.0;
		while (true) {
			double nextGuess = (lastGuess + number / lastGuess) / 2;
			if (Math.abs(nextGuess - lastGuess) < 0.0001) {
				return nextGuess;
			}
			lastGuess = nextGuess;
		}
	}
}
