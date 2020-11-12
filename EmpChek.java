package bridge.lab;

import java.util.Random;

public class EmpChek {

	public static void main(String x[]) {
		System.out.println("******Employee_Daily_Wages*******");

		DailyWages();
	}

	// UC2_Employee_Daily_Wages
	static void DailyWages() {
		int Is_Full_Time = 1;
		int EmpRate_Hour = 20;
		int EmpHrs = 8;
		int Salary = 0;

		Random rn = new Random();
		int rand = rn.nextInt(2);
		if (rand == Is_Full_Time) {

			Salary = (EmpHrs * EmpRate_Hour);
			System.out.println("Employee Is Present and Salary is: " + Salary);

		} else {
			System.out.println("Employee Is Not Present..!!!");

		}
	}
}