package ch05;

public class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	public ColorPoint() {
		
	}

	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
	
}
