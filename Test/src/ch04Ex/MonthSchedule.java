package ch04Ex;

import java.util.Scanner;

public class MonthSchedule {
	
	Scanner scanner = new Scanner(System.in);

	int date;
	Day day[];

	public MonthSchedule(int days) {

		date = days;
		day = new Day[date];
		for (int i=0; i<day.length; i++)
		{
			day[i] = new Day();
		}
	}

	private void input() {
		System.out.println("날짜?(1~30)");
		int i = scanner.nextInt(); //i가 날짜이므로, 배열의 순서 자체는 i-1이다. 그래서 work 할당 시 i-1을 해주어야 함
		
		System.out.println("할일?(빈칸없이입력)");
		String work = scanner.next();
		day[i-1].set(work);

	}

	private void view() {
		System.out.println("날짜?(1~30)");
		int i = scanner.nextInt();
		
		System.out.print(String.format("%s의 할 일은", i));
		day[i-1].show();

	}

	private void finish() {
		System.out.println("프로그램을 종료합니다.");
	}

	public void run() {
		
		System.out.println("할일(입력:1, 보기:2, 끝내기:3) >>");
		Scanner scanner = new Scanner(System.in);
		int select = scanner.nextInt();

		switch (select) {
		case 1: {
			input();
			run();
			break;
		}
		case 2: {
			view();
			run();
			break;
		}
		case 3: {
			finish();
			break;
		}
		default:
		}
		scanner.close();
	}

}
