package ch07;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList<String> grade = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("빈 칸으로 분리하여 5개의 학점을 입력하시오.(A~F)>>");
		for (int i = 0; i < 5; i++)
			grade.add(scanner.next());

		for (int i = 0; i < grade.size(); i++) {
			switch (grade.get(i)) {

			case "A":
				System.out.println("4.0");
				break;
			case "B":
				System.out.println("3.0");
				break;
			case "C":
				System.out.println("2.0");
				break;
			case "D":
				System.out.println("1.0");
				break;
			case "F":
				System.out.println("0.0");
				break;
			}
			scanner.close();
		}
	}
}