
package za.co.pvi.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import za.co.pvi.ageStatistics.AgeStatistic;
import za.co.pvi.people.Student;

public class Appliction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Student> students = new ArrayList<Student>();
		AgeStatistic agaStatistic = new AgeStatistic();
		Student student = new Student();
		student.setAgeStatistic(agaStatistic);

		System.out.println(student);

		for (int i = 0; i < 100; i++) {
			int option = 0;

			for (;;) {
				scan.nextLine();
				try {
					System.out.println();
					System.out.println("WELCOME TO BIRTHDAY DIFFERENCE");
					System.out.println("Select from the Options below.");
					System.out.println("1. register");
					System.out.println("2. getHighetYear");
					System.out.println("3. exit");

					option = scan.nextInt();
					break;
				} catch (Exception ex) {
					//System.out.println("Select from the Options below.");
				} // end of the catch block

			} // end of infinite for loop

			if (option == 1) {
				student = new Student();
				System.out.println("\nFor Employee to register.");
				scan.nextLine();
				System.out.println("Enter surname: ");
				String surname = scan.nextLine();
				System.out.println("Enter firstName: ");
				String firstName = scan.nextLine();

				String dateOfBirth;
				for (;;) {
					scan.nextLine();
					try {
						System.out.println("Enter Date Of Birth(Year-Month-day): ");
						dateOfBirth = scan.nextLine();
						break;
					} catch (Exception ex) {
						System.out.println("Enter Date Of Birth(Year-Month-day): ");
					}
				}
				System.out.println("Enter idNumber: ");
				String idNumber = scan.nextLine();
				System.out.println("Enter gender: ");
				String gender = scan.nextLine();

				student.register(surname, firstName, dateOfBirth, idNumber, gender);
				students.add(student);
				// System.out.println(student);
				System.out.println(students);

			} // end of if statement for option 1

			if (option == 2) {
				System.out.println("Highest Year");
				student.getHighestYear(students);

			} else if (option == 3) {
				System.out.println("<<<<<<<<<<<To Exit>>>>>>>>>>");
				System.exit(0);

			}

		} // end of the main for loop

	}// end of the main method

}
