package ch03;

public class Q10 {
	public static void main(String[] args) {
		int arr[][] = new int[4][4]; //배열 초기화

		int count = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = 0;  //16개를 0으로 다 채움
			}
		}
		while (count < 10) { //count : 랜덤 숫자가 배열에 몇 개 있는지 보기
			//count가 0부터 시작해서 9까지 진행하므로 총 10번임
			int r = (int) (Math.random() * 4);
			int c = (int) (Math.random() * 4);

			if (arr[r][c] != 0) { //이미 숫자가 들어있음
				continue;
			} else {
				arr[r][c] = (int) (Math.random() * 10+1);
				count++;
			}
		}
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {

					System.out.printf("%3d", arr[i][j]);
				}
				System.out.println();
			}
		}
	}
