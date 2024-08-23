package ch05_12;

import java.util.Scanner;

public class ShapeManager {

	Shape start;
	Shape last;

	public ShapeManager() {
		start = null;
		last = null;
	}

	private void insert(int type) {

		Shape obj = null;
		switch (type) {
		case 1:
			obj = new Line();
			break;
		case 2:
			obj = new Rect();
			break;
		case 3:
			obj = new Circle();
			break;
		}
		// 1. start 가 null일 경우, last가 null일 경우
		if (start == null) {
			start = obj;
			last = obj; // 추후 insert할 때 사용됨
		} else {
			last.setNext(obj);
			last = obj;
		}
	}

	private boolean delete(int position) {
		// 1. 지울 수 있는 값이 없을 때(리스트가 비었을 때, start가 null일 때)
		// 2.1개만 있을 때
		// 3. n개

		// 1.
		if (start == null)
			return false;
		// 2.
		if (start == last) {
			start = null;
			last = null;
			return true;
		}

		// 3.
		// 먼저 현재 노드를 찾는다.
		// 현재 위치를 저장할 변수를 만든다
		Shape current;
		current = start;

		Shape previous;
		previous = start;

		// 0.삭제할 current 찾는다.
		for (int i = 1; i < position; i++) {
			previous = current;
			current = current.getNext();
			if (current == null)
				return false;
		}
		// 3-1 n개 중 처음일 경우
		if (current == start)
			start = start.getNext();
		else if (current == last) {
			last = previous;
			last.setNext(null);// 3-2 n개 중 마지막일 경우
		}
		// 3-3 n개 중 중간일 경우
		else {
			// previous.next = current.next;
			previous.setNext(current.getNext());
		}
		return true;

	}

	private void view() {
		Shape current = start;
		while (current != null) {
			current.draw();
			current = current.getNext();
		}
	}

	private void finish() {
		System.out.println("프로그램을 종료합니다.");
	}

	public void run() {
		System.out.println("그래픽 에디터 G-v1.0을 실행합니다.");

		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		while (choice != 4) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				// 입력
				System.out.println("Line(1), Rect(2), Circle(3)>>");
				int type = scanner.nextInt();
				insert(type);
				break;
			case 2:
				// 삭제
				System.out.println("삭제할 도형의 위치(0부터 시작)>>");
				int position = scanner.nextInt();
				if (!delete(position)) {
					System.out.println("삭제할 수 없습니다.");
				}
				break;
			case 3:
				// 모두보기
				view();
				break;
			case 4:
				// 종료
				finish();
				break;
			default:

				scanner.close();
			}
		}
	}
}
