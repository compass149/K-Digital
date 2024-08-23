package ch05.ex13;

public class Oval implements Shape {
	private int height;
	private int width;

	public Oval(int radius1, int radius2 ) {
		this.height = height;
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println(String.format("%s X %s에 내접하는 타원입니다.", height, width));
	}

	@Override
	public double getArea() {
		return (height/2)*(width/2)*PI;
	}

}
