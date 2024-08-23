package ch04Ex;

public class Rectangle
{
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square()
	{
		return width*height;
	}
	public boolean contains(Rectangle r) //참조에 의한 전달
	{
		if(this.x <= r.x && this.y <= r.y && this.square()>=r.square())
		{
			return true;
		}
		else {
			return false;
		}
	}

	public void show() {
		System.out.println
		(String.format("(%s, %s)에서 크기가 %s X %s인 사각형", x,y,width,height));
		
	}

}
