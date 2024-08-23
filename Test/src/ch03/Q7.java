package ch03;

public class Q7 {

	public static void main(String[] args) {

		System.out.print("랜덤한 정수들 : ");
		int num[] = new int[10];
		float sum =0;
		for (int j = 0; j < num.length; j++) {
			int i = (int) (Math.random() * 10 + 1);
			System.out.print(i + " ");
			sum += i;
		}

			System.out.print(String.format("\n평균은 %s", sum/10.0));
		}
	}
