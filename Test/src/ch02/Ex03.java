package ch02;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		HashMap<String, Integer> menu = new HashMap<String, Integer>();
		menu.put("에스프레소", 2000);
		menu.put("아메리카노", 2580);
		menu.put("카푸치노", 3000);
		menu.put("카페라떼", 3500);
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다.");
		while (true) {
			String drink = scanner.next();
			if (drink.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}

			System.out.println(drink + "는 " + menu.get(drink) + "원 입니다.");
			continue;
		}
		scanner.close();
	}
}
