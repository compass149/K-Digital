package ch03;

import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str[] = { "가위", "바위", "보" };

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        while (true) {
            System.out.print("가위 바위 보!>> ");
            String human = scanner.next();

            if (human.equals("그만")) {
                break;
            }

            int n = (int) (Math.random() * 3);
            String computer = str[n];

            System.out.print("사용자 = " + human + ", 컴퓨터 = " + computer + ", ");

            if (human.equals(computer)) {
                System.out.println("비겼습니다.");
            } else {
                switch (human) {
                    case "가위":
                        if (computer.equals(str[2])) {
                            System.out.println("사용자가 이겼습니다.");
                        } else {
                            System.out.println("컴퓨터가 이겼습니다.");
                        }
                        break;
                    case "바위":
                        if (computer.equals(str[0])){
                            System.out.println("사용자가 이겼습니다.");
                        } else {
                            System.out.println("컴퓨터가 이겼습니다.");
                        }
                        break;
                    case "보":
                        if (computer.equals(str[1])) {
                            System.out.println("사용자가 이겼습니다.");
                        } else {
                            System.out.println("컴퓨터가 이겼습니다.");
                        }
                        break;
                    default:
                        System.out.println("올바른 선택을 해주세요.");
                        break;
                }
            }
        }
        scanner.close();
    }
}
