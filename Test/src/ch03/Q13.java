package ch03;

public class Q13 {

	public static void main(String[] args) {
		for (int i = 1; i <= 99; i++) {
			if (i < 10) {
				if (i % 3 == 0) {
					String once = "짝";
					System.out.println(i + " 박수 " + once);
				}
			} else { 
				var ten = i/10;
				var one = i%10;
				
				if (ten % 3 == 0 && one % 3 != 0 && one !=0
						|| ten % 3 != 0 && one % 3 == 0 && one !=0) {
					System.out.println(i + " 박수 짝");
				}

				if (one % 3 == 0 && ten % 3 == 0 && one !=0) {
					System.out.println(i + " 박수 짝짝" );
				}

			}
		}
	}
}
