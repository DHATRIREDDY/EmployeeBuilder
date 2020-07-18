package programscc;

public class EmployeeBuilder {
public static void main(String[] args)
{
	System.out.println("Welcome to Employee Wage Compuation Program ");
    int isPartTime=2,isFullTime=1;
    int empRatePerHr=20, full_empHrs=8,partTime_empHrs=4,salary=0;
    double empCheck=Math.floor(Math.random()*10)%3;	   		   	
    if( empCheck == isFullTime)
    {
    	System.out.println("Employee is Present for FullTime");
        salary=empRatePerHr*full_empHrs;
    }
    else if( empCheck == isPartTime)
    {
    	System.out.println("Employee is Present for PartTime");
    	salary=empRatePerHr*partTime_empHrs;
    }
    else
    {
    	System.out.println("Employee is Abscent");
        salary=0;
    }
    System.out.println("Salary:"+salary);
}

}
