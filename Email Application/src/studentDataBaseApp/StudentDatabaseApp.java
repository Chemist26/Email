package studentDataBaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {		
        // Ask how many new users we want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		
		
		// Create n number of new students
		Student[] students = new Student[numOfStudents];
		for (int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
		}
		
	}

}
