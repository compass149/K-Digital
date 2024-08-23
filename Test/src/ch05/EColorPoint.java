package ch05;

public class EColorPoint extends EPoint {

	private String color;
	public EColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public static void main(String[] args) {
		EColorPoint cp = new EColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(String.format("%s입니다.", str));
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setXY(int x, int y) {
		move(x, y);
	}
	
	public String toString() { //15열의 toString을 overriding을 해주어야 함
		return color + "색의 " + "(" + getX() + "," + getY() + ")의 점"; 
	}

}
