package ch03;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 100,10, 1};
		System.out.print("금액을 입력하시오>> ");
		int money = scanner.nextInt();
		
		for (int i = 0; i<unit.length; i++)
		{
			int count = money / unit[i];
		
			System.out.println(String.format("%s원 짜리 : %s개", unit[i],count));
			money = money % unit[i];
		}
		
		scanner.close();
	}
}
