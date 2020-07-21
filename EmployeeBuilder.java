package programscc;

public class EmployeeBuilder {
	public static final int isPartTime=1;
    public static final int isFullTime=2;
    
    private final String company;
    private final int empRatePerHr;
    private final int workingDays;
    private final int maxHrsMonth;
    public EmployeeBuilder(String company,int empRatePerHr,int workingDays,int maxHrsMonth)
    {
    	this.company=company;
    	this.empRatePerHr=empRatePerHr;
    	this.workingDays=workingDays;
    	this.maxHrsMonth=maxHrsMonth;
    }
    int empWageComputation()
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
	    return totalEmpHrs*empRatePerHr;
	    //System.out.println("Total Salary:"+totalSalary);
	}
   public static void main(String[] args)
   {
	 System.out.println("Welcome to Employee Wage Compuation Program ");
     EmployeeBuilder dmart=new EmployeeBuilder("DMart",20,20,100);
     EmployeeBuilder bigBasket=new EmployeeBuilder("BigBasket",20,2,10);
     EmployeeBuilder more=new EmployeeBuilder("More",30,20,100);
     System.out.println("Total EmpWage for Company"+dmart.company+" is :"+dmart.empWageComputation());
     System.out.println("Total EmpWgae for company"+bigBasket.company+"is:"+bigBasket.empWageComputation());
     System.out.println("Total EmpWage for Company"+more.company+" is :"+more.empWageComputation());
     
   }

}
