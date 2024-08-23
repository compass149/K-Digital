package ch05;


public class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		this.x = this.y=0;
	}

	public void set(int x, int y) {
		this.x =x; this.y=y;
	}
	
	public void showPoint() {
		System.out.println(String.format("(%s, %s)", x,y));
	}

	public void move(int x2, int y2) {
		// TODO Auto-generated method stub
		
	}
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public String toString() {
		return "(" +x+","+y+")";
	}
}
