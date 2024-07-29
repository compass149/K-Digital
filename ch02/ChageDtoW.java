package ch02;

import java.util.Scanner;

public class ChageDtoW {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원화를 입력하세요(단위 원)>>");
		float won = scanner.nextFloat();
		
		float dollar = won / 1216;
		double complete = (Math.round(dollar*100)/100.0);
		System.out.println((int)won +"원은 "+ "$"+complete +"입니다.");
		
		scanner.close();
	}
}
