public class EmployeeWage {
	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int WAGE_PER_HOUR = 20;
		int FULL_DAY_HOUR = 8;
		int PART_TIME_HOUR = 4;
		double empCheck = Math.floor(Math.random() * 10 ) %3;
		int dailyWage=0;

		System.out.println("Welcome to Employee Wage Program");
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present.");
			dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
		}
		else if (empCheck == IS_PART_TIME) {
			System.out.println("Employee is Part time Present.");
			dailyWage=WAGE_PER_HOUR*PART_TIME_HOUR;
		}
		else 
		{
			System.out.println("Employee is Absent.");
		}
		System.out.println("daily wage of employee is:" + dailyWage);
	}

}
