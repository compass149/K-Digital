package ch02;

import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("점수를 입력하세요(0~100)");

		int score = scanner.nextInt();
		if (score / 10 >= 9)
			score = 1;
		else if (score / 10 >= 8)
			score = 2;
		else if (score / 10 >= 7)
			score = 3;
		else if (score / 10 >= 6)
			score = 4;
		else
			score = 5;

		switch (score) {
		case 1:
			System.out.println("학점은 A 입니다.");
			break;
		case 2:
			System.out.println("학점은 B 입니다.");

			break;
		case 3:
			System.out.println("학점은 C 입니다.");

			break;
		case 4:
			System.out.println("학점은 D 입니다.");

			break;
		case 5:
			System.out.println("학점은 F 입니다.");

		default:

		}
		scanner.close();
	}

}
