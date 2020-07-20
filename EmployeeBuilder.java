package programscc;

public class EmployeeBuilder {
	static final int isPartTime=1;
    static final int isFullTime=2;
    static final int empRatePerHr=20;
    static final int maxHrsMonth=100;
    static final int workingDays=20;
    void empWageComputation()
	{
	    int empHrs=0,salary=0,workingHrs=0,totalworkingDays=0,totalEmpHrs=0,totalSalary=0;
	    System.out.println("Day\tEmpHrs\tSalary\tTotalEmpHrs");
	    while(workingHrs<=maxHrsMonth && totalworkingDays<workingDays)
	    {
	      totalworkingDays++;
	      int empCheck=(int)Math.floor(Math.random()*10)%3;
	      switch(empCheck)
	      {
	         case  isPartTime:
	        	 empHrs=4; 
	             break;
	         case isFullTime:
	        	 empHrs=8;
	    	      break;
	         default:
	        	empHrs=0;
	     }
	      salary=empHrs*empRatePerHr;
	      totalEmpHrs+=empHrs; 
	      System.out.println(totalworkingDays+"\t"+empHrs+"\t"+salary+"\t"+totalEmpHrs);
	    }
	    totalSalary=totalEmpHrs*empRatePerHr;
	    System.out.println("Total Salary:"+totalSalary);
	}
   public static void main(String[] args)
   {
	 System.out.println("Welcome to Employee Wage Compuation Program ");
     EmployeeBuilder b=new EmployeeBuilder();
     b.empWageComputation();
   }

}
