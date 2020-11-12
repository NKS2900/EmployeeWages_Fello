package bridge.lab;

import java.util.Random;

public class EmpChek {

	public static void main(String[] args) {

		// UC1--> Check Employee is present or not Using Random()
		Attendance();
	}

	static void Attendance() {
		int isFullTime = 1;
		Random rn = new Random();
		int rand = rn.nextInt(2);
		System.out.println("-------Employee_Wages--------");
		if (rand == isFullTime) {
			System.out.println("Employee present");
		} else
			System.out.println("Empoyee absent.");
	}
}
