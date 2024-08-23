package ch04Ex;

public class Circle {
	private double x,y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public void show () 
	{
		System.out.println(String.format("(%s, %s)%s", x,y,radius));
	}
	public void largeShow ()
	{
		System.out.println(String.format("면적이 가장 큰 원은 (%s, %s)%s", x,y,radius));
	}

}
