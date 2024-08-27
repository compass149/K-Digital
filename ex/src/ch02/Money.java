package ch02;

import java.util.Scanner;

public class Money 
{

	public static void main(String[] args) 
	{
		System.out.print("금액을 입력하시오>>");
	
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		
		int fiftythnd = money / 50000;
		int tenthnd = (money - (fiftythnd * 50000))/10000;
		int thnd = (money - (fiftythnd*50000 + tenthnd*10000))/1000;
		int fivehnd =(money-(fiftythnd*50000 + tenthnd*10000 + thnd * 1000))/500;
		int hnd =(money-(fiftythnd*50000 + tenthnd*10000 + thnd * 1000 + fivehnd *500))/100;
		int fifty=(money-(fiftythnd*50000 + tenthnd*10000 + thnd * 1000 + fivehnd*500 + hnd*100))/50;
		int ten =(money-(fiftythnd*50000 + tenthnd*10000 + thnd * 1000+ fivehnd*500 + hnd*100+fifty*50))/10;
		
		System.out.println("오만원권 " + fiftythnd + "매");
		System.out.println("만원권 " + tenthnd + "매");
		System.out.println("천원권 " + thnd + "매");
		System.out.println("오백원 " + fivehnd + "개");
		System.out.println("백원 " + hnd + "개");
		System.out.println("오십원 " + fifty + "개");
		System.out.println("십원 " + ten + "개");
		
		scanner.close();
	}

}
