package ch02;
import java.util.Scanner;

public class Q9 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

//		좌표평면 위의 두 점 A(x1, y1), B(x2, y2) 사이의 거리
//		AB = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))
		
		System.out.print("원의 중심과 반지름 입력>> ");
		float centerX = scanner.nextFloat();
		float centerY = scanner.nextFloat();
		float radius = scanner.nextFloat();
		
		System.out.print("점 입력>> ");
		float x = scanner.nextFloat();
		float y = scanner.nextFloat();
		
		double distnce = Math.sqrt((centerX-x)*(centerX-x)+(centerY-y)*(centerY-y));

		if (distnce > radius) {
			System.out.println("원 안에 없다.");
		} else {
			System.out.println(String.format("점 (%s, %s)는 원 안에 있다.", x, y));
		}

		scanner.close();
	}

}
