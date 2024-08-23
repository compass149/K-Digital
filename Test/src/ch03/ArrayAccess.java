package ch03;

import java.util.Scanner;


public class ArrayAccess {  //최솟값도 만들어보기

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[];
		intArray = new int[5];
		int max = 100;
		System.out.println("양수 5개를 입력하세요.");
		
		for(int i =0; i<5; i++) {
			intArray[i]=scanner.nextInt();
			if (intArray[i]> max )
				max =intArray[i];
		}
		System.out.print(String.format("가장 큰 수는 %s 입니다.",max));
		
		scanner.close();
	}
}
