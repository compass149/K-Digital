package ch06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Blank {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //스캐너 열고 닫는 것은 while문 바깥에 하기
		while (true) {
			String line = scanner.nextLine();

			if (line.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			} else {
				StringTokenizer st = new StringTokenizer(line, " ");
				int blank = st.countTokens();
				System.out.println("어절 개수는 " + blank);
			}
		}
		scanner.close();
	}
}