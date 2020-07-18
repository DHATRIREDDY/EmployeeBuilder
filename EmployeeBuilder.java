package programscc;

public class EmployeeBuilder {
public static void main(String[] args)
{
	System.out.println("Welcome to Employee Wage Compuation Program ");
    int isPresent=1;
    int empRatePerHr=20, empHrs=8,salary=0;
    double empCheck=Math.floor(Math.random()*10)%2;
    if(empCheck == isPresent)
    	System.out.println("Employee is Present");
    else
    	System.out.println("Employee is Abscent");
    if( empCheck == isPresent)
    {
    	salary=(empHrs*empRatePerHr);
    	System.out.println(salary);
    }
    else
    {
    	salary=0;
    	System.out.println(salary);
    }	   	
}

}
