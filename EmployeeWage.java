import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.lang.reflect.Array;
import java.util.*;
class computeEmployeeWage {

		private static final int IS_ABSENT = 0;
		private static final int IS_PART_TIME = 1;
		private static final int IS_FULL_TIME = 2;
		
		private static String company;
		private static  int WAGE_PER_HOUR;
		private static int MAX_HR_IN_MONTH;
		private static int NUM_OF_WORKING_DAYS;
		
		  @SuppressWarnings("static-access")
		computeEmployeeWage(String company,int WAGE_PER_HOUR,int MAX_HR_IN_MONTH,int NUM_OF_WORKING_DAYS)
		 {
			  this.company=company;
			  this.WAGE_PER_HOUR=WAGE_PER_HOUR;
			  //this.workingHr=workingHr;
			  this.MAX_HR_IN_MONTH=MAX_HR_IN_MONTH;
			  this.NUM_OF_WORKING_DAYS=NUM_OF_WORKING_DAYS;
		 }
		  public String getCompany()
		  {
			  return this.company;
		  }
		  public static int monthlyWage()
		  {
			 int empHrs=0;
			 int empWage=0;
			 int totalWorkingHrs = 0;
			 int totalWorkingDays = 0;
			 int totalWage=0;
		
		//computation
		while(totalWorkingHrs <= MAX_HR_IN_MONTH && totalWorkingDays <= NUM_OF_WORKING_DAYS)
		{
		
			totalWorkingDays++;
			int empCheck = (int)Math.floor(Math.random() * 10)%3;
			switch (empCheck)
			{
				case 0:
					empHrs=0;
					break;
				case 1:
					empHrs=4;
					break;
				case 2:
					empHrs=8;
					break;
			}
			
			totalWorkingHrs+=empHrs;
			empWage=empHrs*WAGE_PER_HOUR;
			totalWage+=empWage;
		}

		return totalWage;

	}
}

public class EmployeeWage {
	public static ArrayList <Integer> company = new ArrayList <Integer>();
	public static void main(String[] args) {
		computeEmployeeWage company1 = new computeEmployeeWage("DMart", 20, 100, 25);
		computeEmployeeWage company2 = new computeEmployeeWage("Reliance", 15, 120, 30);
		computeEmployeeWage company3 = new computeEmployeeWage("Big basket", 25, 130, 35);
		company.add(company1.monthlyWage());
		company.add(company2.monthlyWage());
		company.add(company3.monthlyWage());
		System.out.println(company);
	}

}
