import java.util.Scanner;
public class EmployeeWage{

        private static void employeeMonthlyWage(String companyName, int WAGE_PER_HOUR,int workingHr,int MAX_HR_IN_MONTH,int NUM_OF_WORKING_DAYS) {
                //variable
                int  empHrs=0;
                int  empWage=0;
                int  totalWorkingHrs=0;
                int  totalWorkingDays=0;
                int  totalWage=0;

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

                        System.out.println("Monthly wage of employee of "+companyName+" is:"+totalWage);

                }

        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                System.out.println("Welcome to Employee Wage Computation");
                System.out.println("Enter the number of Companies:");
                int number=sc.nextInt();
                for (int i=1;i<=number;i++)
                {
                System.out.println("Enter the Company Name");
		 String companyName=sc.next();
                System.out.println("Enter Wage per Hour");
                int WAGE_PER_HOUR=sc.nextInt();
                System.out.println("Enter Full day Hour");
                int workingHr=sc.nextInt();
                System.out.println("Enter Total Hours");
                int MAX_HR_IN_MONTH=sc.nextInt();
                System.out.println("Enter Day Per Month");
                int NUM_OF_WORKING_DAYS=sc.nextInt();
                employeeMonthlyWage(companyName,WAGE_PER_HOUR,workingHr,MAX_HR_IN_MONTH,NUM_OF_WORKING_DAYS);
                        }
                }

}

