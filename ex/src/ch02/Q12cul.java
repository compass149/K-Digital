package ch02;

import java.util.Scanner;

public class Q12cul 
{

    public static void main(String[] args) 
    {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("연산>> ");
        float a = scanner.nextFloat();
        String cul = scanner.next();
        float b = scanner.nextFloat();
        float ans = 0;
        //   cul == "+"가 아닌 cul.equals("+")를 쓰는 이유 
        // : cul이 기본 자료형이 아닌 객체 자료형이기 때문
        
        switch (cul) {
        case "+":
            ans = a + b;
            System.out.println(String.format("%.0f %s %.0f의 계산 결과는 %.0f", a, cul, b, ans));
            break;
        case "-":
            ans = a - b;
            System.out.println(String.format("%.0f %s %.0f의 계산 결과는 %.0f", a, cul, b, ans));
            break;
        case "*":
            ans = a * b;
            System.out.println(String.format("%.0f %s %.0f의 계산 결과는 %.0f", a, cul, b, ans));
            break;
        case "/":
            if (b != 0) {
                ans = a / b;
                System.out.println(String.format("%.0f %s %.0f의 계산 결과는 %.0f", a, cul, b, ans));
            } else {
                System.out.println("0으로 나눌 수 없습니다.");
            }
            break;
        default:
            System.out.println("잘못된 연산자입니다.");
            break;
        }
        scanner.close();
    }
}
