package seungmin.calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = "cal>"; //변경X
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		while(true) {
		System.out.println("달을 입력해주십시요.");
		System.out.print(PROMPT);
		int month = sc.nextInt();
		if(month < 1) break;
		if(month > 12) continue;
		int m = cal.getMaxDaysOfMonth(month);
		System.out.println(month+"월은 "  + m + "일까지 있습니다.");
//		System.out.printf("%d월은 %d일까지 있습니다.",a,m);
		cal.printCalendar(2017, month);
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
