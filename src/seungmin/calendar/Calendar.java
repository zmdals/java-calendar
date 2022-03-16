package seungmin.calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31}; 
	public int getMaxDaysOfMonth(int month) {
		return daysOfMonth[month-1];
	}
	public void printSampleCalender() {
		System.out.println("일 월  화  수 목 금 토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	public static void main(String[] args) {
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("달을 입력해주십시요.");
		int a = sc.nextInt();
		int m = cal.getMaxDaysOfMonth(a);
		System.out.println(a+"월은 "  + m + "일까지 있습니다.");
		System.out.printf("%d월은 %d일까지 있습니다.",a,m);
//		cal.printSampleCalender();
		sc.close();

	}

}
