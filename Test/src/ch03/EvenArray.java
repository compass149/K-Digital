package ch03;

public class EvenArray {
    // n까지의 짝수를 포함하는 배열을 반환하는 메서드
    static int[] makeEvenArray(int n) {
        int size = n / 2; // 짝수의 개수는 n/2
        int[] evenArray = new int[size];
        for (int i = 0, num = 2; i < size; i++, num += 2) {
            evenArray[i] = num; // 배열에 짝수 넣기
        }
        return evenArray; // 배열 리턴
    }

    public static void main(String[] args) {
        int n = 10; // 예제의 경우 n은 10
        int[] evenNumbers = makeEvenArray(n); // 짝수 배열 생성
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i] + " "); // 배열 요소 출력
        }
    }
}
//
//설명:
//makeEvenArray(int n):
//
//주어진 숫자 n까지의 짝수를 포함하는 배열을 생성합니다.
//size는 배열의 크기이며, 이는 n까지의 짝수 개수로 계산됩니다.
//반복문을 통해 2부터 시작하여 n까지의 짝수를 배열에 채웁니다.
//배열을 완성한 후, 이를 반환합니다.
//main(String[] args):
//
//n 값을 설정하고, makeEvenArray(n) 메서드를 호출하여 짝수 배열을 생성합니다.
//생성된 배열을 출력합니다.
