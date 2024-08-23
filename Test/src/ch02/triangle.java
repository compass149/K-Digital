package ch02;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수 3개 입력하십시오>>");
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		int third = scanner.nextInt();

		// 가장 큰 수가 나머지 수 두개를 더한 것 보다 작으면 true
		if ((first - second) >= 0 && (first - third) >= 0) // first가 가장 큼
		{
			if (first < (second + third)) 
			{
				System.out.println("삼각형이 됩니다.");
			} else {
				System.out.println("삼각형 불가.");
			}

		} else if ((second - first) >= 0 && (second - third) >= 0) 
		{
			if (second < (first + third)) 
			{
				System.out.println("삼각형이 됩니다.");
			} else {
				System.out.println("삼각형 불가.");
			}

		} else if ((third - first) >= 0 && (third - second) >= 0) 
		{
			if (third < (first + second)) 
			{
				System.out.println("삼각형이 됩니다.");
			} else 
			{
				System.out.println("삼각형 불가.");
			}
		}
	
		else {
			System.out.println("삼각형 불가.");
		}
		scanner.close();

	}

}
