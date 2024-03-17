// Omer Ahmer, ID 2014063

package module5;

public class Assignment5 {
	public static void main(String[] args) {
		Course COMSC255 = new Course("Programming with Java", "Laura Lan Lo");
		for (int i = 0; i < 20; i++) {
			COMSC255.addStudent("Student " + (i+1));
		}
		
		COMSC255.dropStudent("Student 1");
		COMSC255.dropStudent("Student 5");
		COMSC255.dropStudent("Student 16");
		
		COMSC255.addStudent("Student 21");
		COMSC255.addStudent("Student 22");
			
		COMSC255.print();
		COMSC255.clear();
	}
}
