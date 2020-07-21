package programscc;
import java.util.*;
interface EmployeeWage
{
	void addCompanyEmpWage(String company,int empRatePerHr,int workingDays,int maxHrsMonth);
	void computeEmpWage();
	int computeEmpWage(CompanyEmpWage companyEmpWage);
	
}
class CompanyEmpWage
{
	 public final String company;
	 public final int empRatePerHr;
	 public final int workingDays;
	 public final int maxHrsMonth;
	 public int totalSalary;
	 public CompanyEmpWage(String company,int empRatePerHr,int workingDays,int maxHrsMonth)
	 {
		    this.company=company;
	    	this.empRatePerHr=empRatePerHr;
	    	this.workingDays=workingDays;
	    	this.maxHrsMonth=maxHrsMonth;
	 }
	 public void TotalSalary(int totalSalary)
	 {
		 this.totalSalary=totalSalary;
	 }
	 public String toString()
	   {
		   return "Total EmpWage for " +company+" company is "+totalSalary;
	   }
}
public class EmployeeBuilder implements EmployeeWage {
	public static final int isPartTime=1;
    public static final int isFullTime=2;
    
    private int no_ofCompanies=0;
    ArrayList<CompanyEmpWage> companyEmpWageArray;
    public EmployeeBuilder()
    {
      companyEmpWageArray = new ArrayList<CompanyEmpWage>();
    }
    public void addCompanyEmpWage(String company,int empRatePerHr,int workingDays,int maxHrsMonth)
    {
    	companyEmpWageArray.add(new CompanyEmpWage(company,empRatePerHr,workingDays,maxHrsMonth));
    	no_ofCompanies++;
    }
   public  void computeEmpWage()
    {
    	for(int i=0;i<no_ofCompanies;i++)
    	{
    	   companyEmpWageArray.get(i).TotalSalary(this.computeEmpWage(companyEmpWageArray.get(i)));
    	   System.out.println(companyEmpWageArray.get(i));
    	}
    }
   public int computeEmpWage(CompanyEmpWage companyEmpWage)
    {
	    int empHrs=0,salary=0,workingHrs=0,totalworkingDays=0,totalEmpHrs=0;
	    System.out.println("Day\tEmpHrs\tSalary\tTotalEmpHrs");
	    while(workingHrs<=companyEmpWage.maxHrsMonth && totalworkingDays<companyEmpWage.workingDays)
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
	      salary=empHrs*companyEmpWage.empRatePerHr;
	      totalEmpHrs+=empHrs; 
	      System.out.println(totalworkingDays+"\t"+empHrs+"\t"+salary+"\t"+totalEmpHrs);
	    }
	    return totalEmpHrs*companyEmpWage.empRatePerHr;
	}
   public static void main(String[] args)
   {
	 System.out.println("Welcome to Employee Wage Compuation Program ");
     EmployeeBuilder empArray=new EmployeeBuilder();
     empArray.addCompanyEmpWage("Dmart",20,4,100);
     empArray.addCompanyEmpWage("Reliance",20,2,20);
     empArray.computeEmpWage();
   }
}
