package bridge.lab;

import java.util.Random;
import java.util.Scanner;

public class EmpChek {

	public static void main(String x[]) {
		System.out.println("******Employee_Daily_Wages*******");

		PartTime();
	}

	static void PartTime() {
		Scanner in = new Scanner(System.in);
		int isFullTime = 1;
		int isPartTime = 0;
		int perHour = 20;
		int FullDayHour = 8;
		Random rn = new Random();
		int rand = rn.nextInt(3);

		if (rand == isPartTime) {
			System.out.println("-------PartTime_Employee_Wages-------");
			System.out.println("Enter no Days Employee Worked : ");
			int day = in.nextInt();
			int partTimeWages = (day * (FullDayHour / 2)) * perHour;
			System.out.println("PartTime_Wages_for " + day + " days : " + partTimeWages + " Rs.");

		} else if (rand == isFullTime) {
			System.out.println("-------FullTime_Employee_Wages-------");
			System.out.println("Enter no Days Employee Worked : ");
			int day = in.nextInt();
			int FullTimeWages = perHour * (FullDayHour * day);
			System.out.println("FullTime_Wages_for " + day + " days : " + FullTimeWages + " Rs.");
		} else
			System.out.println("Employee Absent..!!!!");

		in.close();
	}
}
