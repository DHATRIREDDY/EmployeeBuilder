package programscc;

public class EmployeeBuilder {
public static void main(String[] args)
{
    System.out.println("Welcome to Employee Wage Compuation Program ");
    int isPresent=1;
    int empRatePerHr=20, empHrs=8,salary=0;
    double empCheck=Math.floor(Math.random()*10)%2;
    if(empCheck == isPresent)
    {
    	System.out.println("Employee is Present");
        salary=(empHrs*empRatePerHr);
	    System.out.println("Salary:"+salary);
    }
    else
    {
    	System.out.println("Employee is Abscent");
    	salary=0;
    	System.out.println("Salary:"+salary);
    }	   	
}

}
