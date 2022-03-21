package seungmin.calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = "cal>"; //변경X
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		while(true) {
		System.out.println("연도 입력해주십시요.");
		System.out.println("YEAR>");
		int year = sc.nextInt();
		System.out.println("달을 입력해주십시요.");
		System.out.println("MONTH>");
		int month = sc.nextInt();
		if(month < 1) break;
		if(month > 12) continue;
		int m = cal.getMaxDaysOfMonth(year,month);
		System.out.println(year+"년도 " + month+"월은 "  + m + "일까지 있습니다.");
//		System.out.printf("%d월은 %d일까지 있습니다.",a,m);
		cal.printCalendar(year, month);
		}
		System.out.println("Bye!");
		sc.close();
	}
	public static void main(String[] args) {
		//셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
