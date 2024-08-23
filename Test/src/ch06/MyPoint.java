package ch06;

public class MyPoint {

	private int x;
	private int y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return getClass().getName()+"("+x+","+y+")";
	}

	public static void main(String[] args) {
		MyPoint a = new MyPoint(3, 20);
		System.out.println(a);
	}
}
