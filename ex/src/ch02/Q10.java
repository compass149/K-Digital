package ch02;

import java.util.Scanner;

public class Q10
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		//좌표평면 위의 두 점 A(x1, y1), B(x2, y2) 사이의 거리
		//AB = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))
		
		//점 사이의 거리가 각 원의 반지름보다 크면 겹치지 않음
		
		System.out.print("첫 번째 원의 중심과 반지름 입력>> ");
		float centerX1 = scanner.nextFloat();
		float centerY1 = scanner.nextFloat();
		float radius1 = scanner.nextFloat();
		
		System.out.print("두 번째 원의 중심과 반지름 입력>> ");
		float centerX2 = scanner.nextFloat();
		float centerY2 = scanner.nextFloat();
		float radius2 = scanner.nextFloat();
		
		double distnce = Math.sqrt((centerX1-centerX2)*(centerX1-centerX2)
								+(centerY1-centerY2)*(centerY1-centerY2));

		if (distnce > (radius1+radius2)) {
			System.out.println("원 안에 없다.");
		} else {
			System.out.println(String.format("두 원은 서로 겹친다."));
		}

		scanner.close();

	}

}
