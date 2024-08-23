package ch05.ex13;

public class Rect implements Shape {
	private int width;
	private int height;

	public Rect(int width, int height) {
		this.height = height;
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println(String.format("%s X %s크기의 사각형입니다.", height, width));
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return height*width;
	}

}
