package com.mycompany.csc325_oop_designreview_lab;

/**
 * MainClass for demonstrating the Student hierarchy.
 *
 * @author MoaathAlrajab
 */
public class MainClass {

	public static void main(String[] args) {
		// Creating instances of Student subclasses
		Freshman std1 = new Freshman("James", (short) 20, 12); // name, age, credits
		Senior std2 = new Senior("John", (short) 30, 90);

		// Setting GPA for students
		std1.setGPA(3.5f); // Assuming GPA
		std2.setGPA(3.8f); // Assuming GPA

		// Printing information
		System.out.println(std1);
		System.out.println(std2);
	}
}
