package ch04;

public class CircleArray 
{
	int radius;
	
	public CircleArray (int radius)
	{
		this.radius = radius;
	}
	
	public double getArea()
	{
		return 3.14*radius*radius;
	}
}
