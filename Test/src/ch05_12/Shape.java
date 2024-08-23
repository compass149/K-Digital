package ch05_12;

class Line extends Shape {

	@Override
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {

	@Override
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public abstract class Shape {
	private Shape next;

	public Shape() {
		next = null;
	}

	public void setNext(Shape obj) {
		next = obj;
	} // 링크 연결

	public Shape getNext() {
		return next; // next라는 객체 리턴
	}

	public abstract void draw();

}
