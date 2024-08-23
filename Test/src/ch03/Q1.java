package ch03;

public class Q1 {

	public static void main(String[] args) {
		
		for (int sum = 0, i = 0; i < 100;) {
			i += 2;
			sum = sum + i;
			if (i > 99) {
				System.out.println(sum);
			}
		}
		
		
		
//		int sum = 0, i =0;
//		while (i <100)
//		{
//			sum = sum +i;
//			i+=2;
//		}
//		System.out.println(sum);
	}

}
