/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;
import java.util.Scanner;
/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of the Student class

                // Todo 7: Create two classes for Freshman and Senior 

                // ToDo 8: The senior class should have a minimum of 85 credits  

		// ToDo 9: Add a toString method for the Student class
		// ToDo 10: Add a toString method for the Freshman class

		Student std1= new Student("James", 20);
                // ToDo 11: Add a toString method for the Senior class

		Freshman std2= new Freshman("James", 20, 12); // name, age, credits

                Senior std3 = new Senior("John", 30, 90);

		// ToDo 12: Set the gpa of the student using the scanner and user
		// 			input and then print the output.

	 Scanner scanner = new Scanner(System.in);
	 System.out.print("Enter the GPA for " + std1.getName() + ": ");
	 double gpa1 = scanner.nextDouble();
	 std1.setGpa(gpa1);
	 scanner.nextLine(); // Consume the newline character

	 System.out.print("Enter the GPA for " + std2.getName() + ": ");
	 double gpa2 = scanner.nextDouble();
	 std2.setGpa(gpa2);
	 scanner.nextLine(); // Consume the newline character

	 System.out.print("Enter the GPA for " + std3.getName() + ": ");
	 double gpa3 = scanner.nextDouble();
	 std3.setGpa(gpa3);
	 scanner.nextLine(); // Consume the newline character

	 // ...

	 scanner.close(); // Close the scanner

	 System.out.println(std1);
	 System.out.println(std2);
	 System.out.println(std3);

		// ToDo 13: add comments and explain your code

	}

}

