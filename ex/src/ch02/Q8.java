package ch02;

import java.util.Scanner;

public class Q8 {
	public static boolean inReact(int x, int y, int rect_x1, int rect_y1, int rect_x2, int rect_y2) {

		if ((x >= rect_x1 && x <= rect_x2) && (y >= rect_y1 && y <= rect_y2))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 점 (x1,y1), (x2,y2)의 좌표를 입력하십시오.>>");
		
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();

		if(inReact(x1, y1, 100, 100, 200, 200)^inReact(x2, y2, 100, 100, 200, 200)) 
			System.out.println("사각형이 겹칩니다.");

		else
			System.out.println("사각형이 겹치지 않습니다.");

		scanner.close();
	}
}
