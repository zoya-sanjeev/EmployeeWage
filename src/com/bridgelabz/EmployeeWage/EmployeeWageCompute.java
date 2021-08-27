package com.bridgelabz.EmployeeWage;

public class EmployeeWageCompute {
	
	
	public static final int FULLTIME = 2;
	public static final int PARTTIME = 1;
	public static final int FULL_TIME_HOURS = 8;
	
	private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	public EmployeeWageCompute() {
		companyEmpWageArray=new CompanyEmpWage[5];
	}
	
	private void addCompanyEmpWage(String companyName,int wagePerHour, int noOfDays, int maxHoursPerMonth) {
		
		companyEmpWageArray[numOfCompany]=new CompanyEmpWage(companyName, wagePerHour, noOfDays, maxHoursPerMonth);
		numOfCompany++;
	}
	
	private void empWageCompute() {
		for(int index=0;index<numOfCompany;index++) {
			companyEmpWageArray[index].setTotalEmpWage(this.empWageCompute(companyEmpWageArray[index]));
			System.out.println(companyEmpWageArray[index]);
		}
	}
	
	private int empWageCompute(CompanyEmpWage companyEmpWage) {
		int workingDays=0, totalEmpHours=0;
		int employeeHours=0;
		while(totalEmpHours <=companyEmpWage.maxHoursPerMonth && workingDays < companyEmpWage.noOfDays) {
			
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
		return totalEmpHours*companyEmpWage.wagePerHour;
		
	}
	
	

	public static void main(String[] args) {
		
		EmployeeWageCompute empWageBuilder=new EmployeeWageCompute();
		empWageBuilder.addCompanyEmpWage("DMart",20, 2,10);
		empWageBuilder.addCompanyEmpWage("Reliance",10, 5,20);
		empWageBuilder.empWageCompute();
	
	}

}
