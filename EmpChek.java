package bridge.lab;

import java.util.Random;

public class EmpChek {

		public static final int FullDayHour = 8;
		public static final int WorkingDayMonth = 20;
		public static final int maxHoursInMonth = 100;
		public static final int perHour = 20;
		
		public static void main(String[] args) {
					
				computeEmpWage();
		}
	
		public static void computeEmpWage() {
			
			int fullTimeDays = 0,partTimeDays = 0,totalempHour = 0,totalWorkingDay = 0,absent = 0;
			 				
			while (maxHoursInMonth > totalempHour && WorkingDayMonth > totalWorkingDay) {

				totalWorkingDay++;
				
				Random rn = new Random();
				int rand = rn.nextInt(3);

				switch (rand) {

				case 0:
					fullTimeDays++;
					totalempHour = totalempHour + FullDayHour;
					break;
				case 1:
					partTimeDays++;
					totalempHour = totalempHour + (FullDayHour / 2);
					break;
				default:
					absent++;
					break;

				}
			}
			int FullTimeSalary = perHour * (FullDayHour * fullTimeDays);
			int PartTimeSalary = (partTimeDays * (FullDayHour / 2)) * perHour;

			System.out.println("------------Employee_Wages-------------");
			System.out.println("---------------------------------------");
			System.out.println("FullTime_Days_in_month: " + fullTimeDays);		
			System.out.println("PartTime_Days_in_month: " + partTimeDays);		
			System.out.println("Absent_Days_in_month: " + absent);
			System.out.println("Total_working_Days_IN_month : " + (fullTimeDays + partTimeDays));
			System.out.println("Total_Hours    :===> " + totalempHour);
			System.out.println("FullTime_Salary:===> " + FullTimeSalary);
			System.out.println("PartTime_Salary:===> " + PartTimeSalary);
			System.out.println("Total_Salary   :===> " + (FullTimeSalary + PartTimeSalary));
			System.out.println("---------------------------------------");
			
		}
	}
