package programscc;

public class EmployeeBuilder {
public static void main(String[] args)
{
	System.out.println("Welcome to Employee Wage Compuation Program ");
    int isPartTime=2,isFullTime=1;
    int empRatePerHr=20, full_empHrs=8,partTime_empHrs=4,salary=0;
    int empCheck=(int)Math.floor(Math.random()*10)%3;
    switch(empCheck)
    {
      case 1:
    	 System.out.println("Employee is Present for FullTime");
         salary=empRatePerHr*full_empHrs;
         break;
      case 2:
    	 System.out.println("Employee is Present for PartTime");
    	 salary=empRatePerHr*partTime_empHrs;
    	 break;
      default:System.out.println("Employee is Abscent");
    }
    System.out.println("Salary:"+salary);
}

}
