package ch04Ex;

import java.util.Scanner;

public class PhoneBook {
	Scanner scanner = new Scanner(System.in);
	private int people;
	private Phone Phones[];

	public void getPerson() {
		System.out.println("인원 수 >> ");
		this.people = scanner.nextInt();
		this.Phones = new Phone[people];

		for (int i=0; i<people; i++)
		{
			Phones[i]=new Phone();
		}
	
		// 입력한 숫자만큼 반복
		for (int i = 0; i < people; i++) {
			System.out.print("이름과 전화번호 (이름과 번호는 빈칸없이 입력)>> ");
			String name = scanner.next();
			String tel = scanner.next();
			Phones[i].set(name, tel);
		}
		System.out.println("저장되었습니다.");
	}

	public void search() {
		while (true) {
			System.out.print("검색할 이름>> ");
			String name = scanner.next();

			if (name.equals("그만")) {
				scanner.close();
				return;
			}
			for (int i = 0; i < people; i++) {
				if (name.equals(Phones[i].getName())) {
					System.out.println(String.format("%sB의 번호는 %s입니다.", name, Phones[i].getTel()));
					break;
				}
				else if(i==Phones.length-1 && !name.equals(Phones[i].getName())) {
					System.out.println(String.format("%s이 없습니다.", name));
				}
			}
		}
	}

}
