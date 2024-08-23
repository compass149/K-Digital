package ch05;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String srcString();
	abstract protected String destString();
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(String.format("%s을(를) %s로 바꿉니다.",
				srcString(), destString()));
		System.out.println(String.format("%s을(를) 입력하세요.>>",
				srcString()));
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println(String.format("반환 결과 : %s %s입니다.",
				res, destString()));
		scanner.close();
	}

}
