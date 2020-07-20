public class EmployeeWage {
	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int WAGE_PER_HOUR = 20;

		int empCheck = (int)Math.floor(Math.random() * 10 ) %3;
		int dailyWage=0;
		int empHrs=0;

		System.out.println("Welcome to Employee Wage Program");
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
		dailyWage=WAGE_PER_HOUR*empHrs;
		System.out.println("Daily wage of employee:"+ dailyWage);
		
	}

}
