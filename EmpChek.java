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

		int perHour = 20;
		int FullDayHour = 8;
		int day;

		Random rn = new Random();
		int rand = rn.nextInt(3);

		switch (rand) {

		case 1:
			System.out.println("-------FullTime_Employee_Wages-------");
			System.out.println("Enter no Days Employee Worked : ");
			day = in.nextInt();
			int FullTimeWages = perHour * (FullDayHour * day);
			System.out.println("Full_Time_Wages_for " + day + " days : S" + FullTimeWages + " Rs.");
			break;
		case 2:
			System.out.println("-------PartTime_Employee_Wages-------");
			System.out.println("Enter no Days Employee Worked : ");
			day = in.nextInt();
			int partTimeWages = (day * (FullDayHour / 2)) * perHour;
			System.out.println("PartTime_Wages_for " + day + " days : " + partTimeWages + " Rs.");
			break;
		default:
			System.out.println("Employee is Absent..!!!!");
			break;

		}
		in.close();
	}
}
