// Omer Ahmer, ID 2014063

package module6;

import java.util.Arrays;

public class Course {
  private String courseName;
  private String[] students;
  private int numberOfStudents;
  private String instructorName;
  public static final int DEFAULT_CAPACITY = 16;
    
  
  public Course(String courseName, String instructorName) {
    this.courseName = courseName;
    this.instructorName = instructorName;
    this.students = new String[DEFAULT_CAPACITY];
  }
  
  private void increaseCapacity() {
	  if (numberOfStudents == students.length) {
		  int newCapacity = students.length * 2;
		  students = Arrays.copyOf(students, newCapacity);
	  }
  }
  
  public void addStudent(String student) {
	increaseCapacity();
    students[numberOfStudents] = student;
    numberOfStudents++;
  }
  
  
  public String[] getStudents() {
    return students;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }  

  public String getCourseName() {
    return courseName;
  }  
  
  public void dropStudent(String student) {
	  for (int i = 0; i < numberOfStudents; i++) {
		  if (students[i].equals(student)) {
			  for (int j = i; j < numberOfStudents - 1; j++) {
				  students[j] = students[j+1];
			  }
			  numberOfStudents--;
			  break;
		  }
	  }
  }
  
  public void clear() {
	  students = new String[100];
	  numberOfStudents = 0;
  }
  
  public void print() {
	  System.out.println("Course name: " + courseName);
	  System.out.println("Instructor Name: " + instructorName);
	  System.out.println("There are " + numberOfStudents + " students enrolled.");
	  System.out.print("List of Students: ");
	  for (int i = 0; i < numberOfStudents; i++) {
		  System.out.print(students[i] + ", ");
	  }
	  System.out.println();
	  System.out.println("Students list after calling clear(): ");
	  clear();
	  for (int i = 0; i < numberOfStudents; i++) {
		  System.out.print(students[i] + ", ");
	  }
  }
  
  public static void main(String[] args) {
	  Course introToJava = new Course("Intro to Java", "Instructor 1");
	  OnlineCourse advancedJava = new OnlineCourse("Advanced Java", "Instructor 2", "Fully asynchronous", 0, 100);
	  OnlineCourse assembly = new OnlineCourse("Assembly Programming", "Instructor 3", "Zoom meetings", 60, 50);
	  for (int i = 0; i < 10; i++) {
		  introToJava.addStudent("Student " + (i+1));
		  advancedJava.addStudent("Student " + (i+1));
		  assembly.addStudent("Student " + (i+1));
	  }
	  System.out.println("Intro course details: ");
	  introToJava.print();
	  System.out.println("Advanced course details: ");
	  advancedJava.print();
	  System.out.println("Assembly course details: ");
	  assembly.print();
  }
  
}











