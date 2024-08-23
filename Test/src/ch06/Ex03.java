package ch06;

public class Ex03 {

	public static void main(String[] args) {
		int num[] = new int[3];
		while (true) {

			for (int i = 0; i < 3; i++) {
				num[i] = (int) (Math.random() * 3 + 1);
			System.out.print(num[i] + " ");
			}
			System.out.println();
			if (num[0] == num[1] && num[1] == num[2]) {
				System.out.println("성공");
				break;
			}
		}
	}
}
