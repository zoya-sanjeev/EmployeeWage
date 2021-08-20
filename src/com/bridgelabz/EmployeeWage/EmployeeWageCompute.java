package com.bridgelabz.EmployeeWage;

public class EmployeeWageCompute {
	
	public static final int absent = 0;
	public static final int fullTime = 2;
	public static final int partTime = 1;
	public static final int fullTimeHrs = 8;
	public static final int wagePerHour = 20;
	public static void main(String[] args) {
		double empCheck= Math.floor(Math.random()*10 %2 );
		int dailyWage = 0,hours=0;
		if(empCheck == fullTime) {
			hours = fullTimeHrs;
		}
		else if(empCheck==partTime){
			hours= fullTimeHrs/2;
		}
		else
			hours=0;
		System.out.println("Daily Wage = "+(hours*wagePerHour));
	}

}
