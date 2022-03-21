package seungmin.calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31}; 
	private static final int[] LEAP_MAX_DAYS = {31,29,31,30,31,30,31,31,30,31,30,31}; 
	public int getMaxDaysOfMonth(int year,int month) {
		if(isLeapYear(year)){
			return LEAP_MAX_DAYS[month-1];
		}
		return MAX_DAYS[month-1];
	}
	public boolean isLeapYear(int year) {
		if(year%4 == 0 && (year % 100 != 0 || year % 400 == 0)) 
			return true;
		else
			return false;
	}
	public void printCalendar(int year,int month) {
		System.out.printf("    <<%4d년,%3d월>>\n", year,month);//각각 4칸,3칸을 차지한다는 뜻.
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println(" --------------------");
		int maxDay = getMaxDaysOfMonth(year,month);
		for(int i=1; i<=maxDay;i++) {
			System.out.printf("%3d",i);
			if(i%7==0) System.out.println();
		}
		System.out.println();
//		System.out.println("1  2  3  4  5  6  7");
//		System.out.println("8  9  10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
	}
	public static void main(String[] args) {

	}

}
