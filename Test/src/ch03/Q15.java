package ch03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("곱하고자 하는 두 수 입력>> ");
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.print(n + "*" + m + "=" + n * m);
				break;

			} catch (InputMismatchException e) {
				System.out.println("정수를 입력해주십시오.");
				scanner.nextLine();
				continue;
			}
		}
		scanner.close();
	}
}
