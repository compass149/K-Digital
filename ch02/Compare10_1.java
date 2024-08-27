package ch02;

import java.util.Scanner;

public class Compare10_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("2자리 수 정수 입력(10 ~ 99)>>");
		int ten = scanner.nextInt();
		// 나머지가 ten과 같은지를 판별한다.

		int one = ten % 10;

		if (ten/10 == one) {
			System.out.println("Yes. 같습니다.");
		} else {
			System.out.println("No. 다릅니다.");
		}

		scanner.close();
	}
}
