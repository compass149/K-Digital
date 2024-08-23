package ch03;

public class Q12 {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("명령행인자(arguement)가 없습니다");
			return;
		}
		int sum = 0;

		for (int i = 0; i < args.length; i++)
			
			try {
				sum = sum + Integer.parseInt(args[i]);
			} 
		
			catch (NumberFormatException e) {
			}
		System.out.println(sum);

	}

}