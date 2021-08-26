package com.bridgelabz.EmployeeWage;

public class EmployeeWageCompute {
	
	public static final int ABSENT = 0;
	public static final int FULLTIME = 2;
	public static final int PARTTIME = 1;
	public static final int FULL_TIME_HOURS = 8;
	
	public static void companyWageCompute(String companyName,int wagePerHour, int noOfDays, int maxHours) {
		
		int day=0, totalHours=0;
		while(totalHours < 100 && day < noOfDays) {
			int hours=0;
			double empCheck = Math.floor(Math.random()*10)%3;
			switch((int)empCheck) {
			case FULLTIME: hours = FULL_TIME_HOURS;
			break;
			
			case PARTTIME: hours = FULL_TIME_HOURS/2;
			break;
			
			case ABSENT: hours = 0;
			}
			totalHours += hours;
			day++;
			System.out.println("Day "+day+": "+hours+" hours");
		}
		totalHours = totalHours>100 ? 100 : totalHours;
		System.out.println(companyName+":Days:"+day+" Total Hours:"+totalHours+" Monthly Wage = "+(totalHours*wagePerHour));
		
	}
	public static void main(String[] args) {
		
		companyWageCompute("Bridgelabz",90, 10, 20);
		companyWageCompute("Perfios",200, 10, 15);
	
	}

}
