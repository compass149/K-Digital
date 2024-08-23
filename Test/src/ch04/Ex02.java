package ch04;

import java.util.Scanner;

public class Ex02 
{

	public static void main(String[] args) 
	{
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println(String.format("사각형의 면적은 %s", rect.getArea()));
		scanner.close();
	}
}
