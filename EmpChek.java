package bridge.lab;

import java.util.Random;
import java.util.Scanner;

public class EmpChek {

	public static void main(String x[]) {
		System.out.println("-------Employee_Wages--------");

		MonthlyWages();
	}

	static void MonthlyWages() {
		int perHour = 20;
		int FullDayHour = 8;
		int WorkingDayMonth = 20;

		Random rn = new Random();
		int rand = rn.nextInt(2);

		if(rand==0) {
			System.out.println("-------FullTime_Employee_Wages_Monthly-------");
			int FullTimeWages = perHour * (FullDayHour * WorkingDayMonth);
			System.out.println("Full_Time_Wages_for " + WorkingDayMonth + " days : " + FullTimeWages + " Rs.");
		}
		else {
			System.out.println("-------PartTime_Employee_Wages_Monthly-------");
			int partTimeWages = (WorkingDayMonth * (FullDayHour / 2)) * perHour;
			System.out.println("PartTime_Wages_for " + WorkingDayMonth + " days : " + partTimeWages + " Rs.");
		}

	}

}
