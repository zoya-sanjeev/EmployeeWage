package com.bridgelabz.EmployeeWage;

public class EmployeeWageCompute {
	
	public static final int FULLTIME = 2;
	public static final int PARTTIME = 1;
	public static final int FULL_TIME_HOURS = 8;
	
	private final String companyName;
	private final int wagePerHour;
	private final int noOfDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;
	
	public EmployeeWageCompute(String companyName,int wagePerHour, int noOfDays, int maxHoursPerMonth) {
		this.companyName=companyName;
		this.wagePerHour=wagePerHour;
		this.noOfDays=noOfDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
		
	}
	
	public void empWageCompute() {
		int workingDays=0, totalEmpHours=0;
		int employeeHours=0;
		while(totalEmpHours <=maxHoursPerMonth && workingDays < noOfDays) {
			
			double empCheck = Math.floor(Math.random()*10)%3;
			switch((int)empCheck) {
			case FULLTIME: employeeHours = FULL_TIME_HOURS;
			break;
			
			case PARTTIME: employeeHours = FULL_TIME_HOURS/2;
			break;
			
			default: employeeHours = 0;
			}
			totalEmpHours += employeeHours;
			workingDays++;
			System.out.println("Day "+workingDays+": "+employeeHours+" hours");
		}
		int totalEmpWage=totalEmpHours*wagePerHour;
		
	}
	
	@Override
	public String toString() {
		return "Total Employee Wage for Company "+companyName+" is "+totalEmpWage;
	}
	

	public static void main(String[] args) {
		
		EmployeeWageCompute dmart=new EmployeeWageCompute("DMart", 20, 2, 20);
		EmployeeWageCompute reliance=new EmployeeWageCompute("DMart", 40, 5, 20);
		dmart.empWageCompute();
		System.out.println(dmart);
		reliance.empWageCompute();
		System.out.println(reliance);
	
	}

}
