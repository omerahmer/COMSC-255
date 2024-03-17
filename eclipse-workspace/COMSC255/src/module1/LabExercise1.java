// Syed Omer Ahmer, ID: 2014063

package module1;

import javax.swing.JOptionPane;

public class LabExercise1 {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "Please enter your name:", "LabExercise1");
		String output = name +", welcome to Java!";
		JOptionPane.showMessageDialog(null, output);
	}
}
