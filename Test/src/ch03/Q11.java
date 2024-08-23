package ch03;

public class Q11 {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("명령행인자(arguement)가 없습니다");
			return;
		}
		int sum =0;
		
		for (int i=0;i<args.length; i++)
		{
			int num = Integer.parseInt(args[i]); 
			sum = sum + num;
		}
		System.out.println(sum/args.length);
	}
}
