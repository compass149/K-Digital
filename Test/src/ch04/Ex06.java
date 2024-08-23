package ch04;

public class Ex06 
{
	public static void main(String[] args) 
	{
		CircleArray [] c;
		c= new CircleArray[5];
		
		for (int i=0; i<c.length; i++)
			c[i] = new CircleArray(i);
		
		for (int i=0; i<c.length; i++)
			System.out.print((int)(c[i].getArea())+" ");
	}
}
