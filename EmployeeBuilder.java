package programscc;
import java.util.*;
interface EmployeeWage
{
	void addCompanyEmpWage(String company,int empRatePerHr,int workingDays,int maxHrsMonth);
	void computeEmpWage();
	int computeEmpWage(CompanyEmpWage companyEmpWage);
	int getTotalWage(String company);
	
}
class CompanyEmpWage
{
	 public final String company;
	 public final int empRatePerHr;
	 public final int workingDays;
	 public final int maxHrsMonth;
	 public int totalSalary;
	 public int wagesArray[];
	 public CompanyEmpWage(String company,int empRatePerHr,int workingDays,int maxHrsMonth)
	 {
		    this.company=company;
	    	this.empRatePerHr=empRatePerHr;
	    	this.workingDays=workingDays;
	    	this.maxHrsMonth=maxHrsMonth;
	    	wagesArray=new int[workingDays+1];
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
    HashMap<String,CompanyEmpWage> getTotalWageMap;
    public EmployeeBuilder()
    {
      companyEmpWageArray = new ArrayList<CompanyEmpWage>();
      getTotalWageMap=new HashMap<String,CompanyEmpWage>();
    }
    public void addCompanyEmpWage(String company,int empRatePerHr,int workingDays,int maxHrsMonth)
    {
    	CompanyEmpWage companyEmpWage = new CompanyEmpWage(company,empRatePerHr,workingDays,maxHrsMonth);
    	companyEmpWageArray.add(companyEmpWage);
        getTotalWageMap.put(company,companyEmpWage);
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
   public int getTotalWage(String company)
   {
	   return getTotalWageMap.get(company).totalSalary;
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
	      companyEmpWage.wagesArray[totalworkingDays]=salary;
	      System.out.println(totalworkingDays+"\t"+empHrs+"\t"+companyEmpWage.wagesArray[totalworkingDays]+"\t"+totalEmpHrs);
	    }
	    return totalEmpHrs*companyEmpWage.empRatePerHr;
	}
   public static void main(String[] args)
   {
	 System.out.println("Welcome to Employee Wage Compuation Program ");
     EmployeeBuilder empArray=new EmployeeBuilder();
     empArray.addCompanyEmpWage("DMart",20,4,100);
     empArray.addCompanyEmpWage("Reliance",20,2,20);
     empArray.computeEmpWage();
     System.out.println("Total Wage for DMart company :"+empArray.getTotalWage("DMart"));
     System.out.println("Total Wage for Reliance  company :"+empArray.getTotalWage("Reliance"));
     
   }
}
