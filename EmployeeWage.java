 //import java.util.*;
 class computeEmployeeWage {

		private static final int IS_ABSENT = 0;
		private static final int IS_PART_TIME = 1;
		private static final int IS_FULL_TIME = 2;

		private static String company;
		private static  int WAGE_PER_HOUR;
		private static int MAX_HR_IN_MONTH;
		private static int NUM_OF_WORKING_DAYS;

		computeEmployeeWage(String company,int WAGE_PER_HOUR,int MAX_HR_IN_MONTH,int NUM_OF_WORKING_DAYS)
		 {
			  this.company=company;
			  this.WAGE_PER_HOUR=WAGE_PER_HOUR;
			  this.MAX_HR_IN_MONTH=MAX_HR_IN_MONTH;
			  this.NUM_OF_WORKING_DAYS=NUM_OF_WORKING_DAYS;
		 }
		  @SuppressWarnings("static-access")
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
		//System.out.println("Monthly wage of employee of "+company+" is:"+totalWage);
		return totalWage;

	}
}
public class  EmployeeWage
{

	    public static computeEmployeeWage companyWage[]= new computeEmployeeWage[3]; 

		public static void main(String args[])
		{
	          //Map<String, Integer> company=new HashMap<>();
	    companyWage[0] = new computeEmployeeWage("DMart", 20, 100, 25);
	    System.out.println(companyWage[0].getCompany()+" : "+companyWage[0].monthlyWage());
	    companyWage[1] = new computeEmployeeWage("Reliance", 15,120,30);
	    System.out.println(companyWage[1].getCompany()+" : "+companyWage[1].monthlyWage());
	    companyWage[2] = new computeEmployeeWage("Big basket", 25,130,35);
	    System.out.println(companyWage[2].getCompany()+" : "+companyWage[2].monthlyWage());
		}
}
