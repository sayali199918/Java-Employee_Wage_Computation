public class EmployeeWage {
	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		double empCheck = Math.floor(Math.random() * 10 ) %2;
		System.out.println("Welcome to Employee Wage Program");
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present.");
		else
			System.out.println("Employee is Absent.");
	}

}
