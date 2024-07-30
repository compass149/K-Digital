package ch03;

import java.util.Scanner;

public class Ex06 
{
	public static void main(String[] args) 
	{
		int []unit = {50000,10000,1000,500,100,50,10,1};
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("금액을 입력해주세요>>");
		
		int money = sc1.nextInt();
		
		for(int i=0; i<unit.length;i++)
		{
			int cnt = money/unit[i];
			if(cnt > 0)
				System.out.println(unit[i]+"은 "+ cnt +"개");
			money = money % unit[i];
		}
	}
}
