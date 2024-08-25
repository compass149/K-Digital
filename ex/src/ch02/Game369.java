package ch02;

import java.util.Scanner;

public class Game369 
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1 ~ 99 사이의 정수를 입력하십시오.>>");
		int num = scanner.nextInt();
		int ten =num /10;
		int one =num %10;
		
		boolean twice = (ten==3 || ten == 6 || ten == 9);
		boolean clap = (one==3 || one == 6 || one == 9);
		if(twice && clap)
		{
			System.out.println("박수 짝짝");
		}
		else if (twice ^ clap)
		{
		System.out.println("박수짝");
		}
		else {
			System.out.println("박수없음");
		}
		scanner.close();

	}


}
