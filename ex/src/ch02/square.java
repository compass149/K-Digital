package ch02;

import java.util.Scanner;

public class square {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("점 (x,y)의 좌표를 입력하십시오.>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if ((x > 100 && y > 100 && x <= 200 && y <= 200)) {
			System.out.println("(" + x + "," + y + ")는 사각형 안에 있습니다.");

		}
		else {
			System.out.println("(" + x + "," + y + ")는 사각형 안에 없습니다.");

		}

		scanner.close();

	}

}
