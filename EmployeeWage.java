public class EmployeeWage {
	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int WAGE_PER_HOUR=20;
		int FULL_DAY_HOUR=8;
		double empCheck = Math.floor(Math.random() * 10 ) %2;
		int dailyWage=0;

		System.out.println("Welcome to Employee Wage Program");
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present.");
			dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
		}
		else 
		{
			System.out.println("Employee is Absent.");
		}
		System.out.println("daily wage of employee is:" + dailyWage);
	}

}
