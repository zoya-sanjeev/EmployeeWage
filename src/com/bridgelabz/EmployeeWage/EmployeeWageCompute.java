package com.bridgelabz.EmployeeWage;

public class EmployeeWageCompute {
	
	public static final int FULLTIME = 2;
	public static final int PARTTIME = 1;
	public static final int FULL_TIME_HOURS = 8;
	
	public static void companyWageCompute(String companyName,int wagePerHour, int noOfDays, int maxHoursPerMonth) {
		
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
		
		System.out.println("Total Employee Wage for Company "+companyName+" is "+totalEmpWage);
		
	}
	public static void main(String[] args) {
		
		companyWageCompute("Bridgelabz",90, 10, 20);
		companyWageCompute("Perfios",200, 10, 15);
	
	}

}
