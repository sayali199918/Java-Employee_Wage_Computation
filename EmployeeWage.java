public class EmployeeWage {
	public static void main(String[] args) {
		//constants
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int WAGE_PER_HOUR = 20;

		//variables
		int dailyWage=0;
		int empHrs=0;
		int totalWage=0;
		int totalWorkingHrs = 0;
		int totalWorkingDays = 0;

		//computation
		System.out.println("Welcome to Employee Wage Program");
		while(totalWorkingHrs <= 100 && totalWorkingDays <= 20)
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
			System.out.println("Days: " +totalWorkingDays+ "Employees hrs: "+empHrs);
		}
		totalWage=totalWorkingHrs*WAGE_PER_HOUR;
		System.out.println("Total wage of employee:"+totalWage);
	}

}
