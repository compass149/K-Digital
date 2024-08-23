package ch03;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 몇 개? ");
		int num = scanner.nextInt();
		int n[]= new int [num];
		
		for (int i = 0; i<n.length; i++)
		{
			n[i] = (int)(Math.random()*100 +1);
			for(int j =0; j<i; j++) { //중복 검사
				if(n[i] == n[j] )
				{
					i--; //이전 배열로 돌아감
				}
			}
		}
			for (int i=0; i<n.length; i++) {
			System.out.print(n[i]+" ");
			
			if((i+1)%10 ==0)
				System.out.println();
		}
		scanner.close();
		
	}

}
