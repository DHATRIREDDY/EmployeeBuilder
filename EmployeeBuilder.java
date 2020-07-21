package programscc;

public class EmployeeBuilder {
	public static final int isPartTime=1;
    public static final int isFullTime=2;
    
    private final String company;
    private final int empRatePerHr;
    private final int workingDays;
    private final int maxHrsMonth;
    private int totalSalary;
    public EmployeeBuilder(String company,int empRatePerHr,int workingDays,int maxHrsMonth)
    {
    	this.company=company;
    	this.empRatePerHr=empRatePerHr;
    	this.workingDays=workingDays;
    	this.maxHrsMonth=maxHrsMonth;
    }
    void empWageComputation()
	{
	    int empHrs=0,salary=0,workingHrs=0,totalworkingDays=0,totalEmpHrs=0;
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
	    //System.out.println("Total Salary:"+totalSalary);
	}
   public String toString()
   {
	   return "Total EmpWage for company:"+ company +" is "+ totalSalary;
   }
   public static void main(String[] args)
   {
	 System.out.println("Welcome to Employee Wage Compuation Program ");
     EmployeeBuilder dMart=new EmployeeBuilder("DMart",20,2,10);
     EmployeeBuilder bigBasket=new EmployeeBuilder("BigBasket",20,4,30);
     dMart.empWageComputation();
     System.out.println(dMart);
     bigBasket.empWageComputation();
     System.out.println(bigBasket);
   }
}
