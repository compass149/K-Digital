package ex1;

import java.util.Scanner;
import java.util.Vector;

public class Ex04 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("2000년 ~ 2009년까지 1년 단위로 키(cm)를 입력");
		System.out.println(">> ");
		
		for (int i = 0; i < 10; i++)
		{
			v.add(scanner.nextInt());
		}
		
		int year = 0;
		int maxGrowth = 0;
		
		for(int j=0; j<9; j++) {
			int growth = v.get(j+1) -v.get(j);
			
			if(growth >maxGrowth) {
				maxGrowth = growth;
			year = 2000 + j + 1;
			}
		}
		
		System.out.println("가장 키가 많이 자란 년도는 " + year + "년 " +maxGrowth);
	}

}
