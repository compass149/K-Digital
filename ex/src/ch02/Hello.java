package ch02;

public class Hello 
{
	public static int sum(int n, int m) 
	{
		return n + m;
	}

	public static void main(String[] args) // 시작하는 클래스이므로
										   // 실행하면 무조건 시작함
	{
		int i = 20;
		int s;
		char a;

		s = sum(i, 10);
		a = '?';
		System.out.println(a);
		System.out.println('\n');
		System.out.println(s);
	}
}
