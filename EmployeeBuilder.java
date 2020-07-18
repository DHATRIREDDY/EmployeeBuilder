package programscc;

public class EmployeeBuilder {
public static void main(String[] args)
{
	System.out.println("Welcome to Employee Wage Compuation Program ");
    int isPartTime=2,isFullTime=1;
    int empRatePerHr=20, full_empHrs=8,partTime_empHrs=4,salary=0;
    int daysPerMonth=20,workingHrs=0,workingDays=0;
    while(workingHrs<100 && workingDays<20)
    {
      int empCheck=(int)Math.floor(Math.random()*10)%3;
      switch(empCheck)
      {
        case 1:
          salary=salary+empRatePerHr*full_empHrs;
          workingHrs=workingHrs+full_empHrs;
          break;
        case 2:
    	  salary=salary+empRatePerHr*partTime_empHrs;
    	  workingHrs=workingHrs+partTime_empHrs;
    	  break;
        default:
        	salary=salary+0;
      }
      workingDays++;
    }
    System.out.println("Working Hours:"+workingHrs);
    System.out.println("Working Days:"+ workingDays);
    System.out.println("Wages for Month:"+salary);
}

}
