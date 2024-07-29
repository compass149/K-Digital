package ch02;

import java.util.Scanner;

public class threeInt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수 3개 입력>>");
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		int third = scanner.nextInt();
		int mid = 0;
		
		//어떤 수에서 뺀 값이 모두 0보다 크고, 모두 0보다 작으면 그 수는 가장 큰 수이고, 가장 작은 수 
		//어떤 수에서 다른 수를 뺐을 때 하나는 0보다 크고 하나는 0보다 작으면 그 수가 mid
		
		if ((first - second)>0 ^ (first-third)>0)
		{
			mid =first;
		}
		else if ((second - first)>0 ^ (second-third)>0)
		{
			mid =second;
		}
		else {
			mid = third;
		}
		
		System.out.println(mid);

		scanner.close();
	}

}
