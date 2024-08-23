package ch04Ex;

import java.util.Scanner;

public class CircleManager {

	void run() {
		Scanner scanner = new Scanner(System.in);

		Circle c[] = new Circle[3];

		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x, y, radius);
		}

		for (int i = 0; i < c.length; i++)
			c[i].show();

		scanner.close();
	}

	public void largest() {
		Scanner scanner = new Scanner(System.in);
		
		Circle c[] = new Circle[3]; //겍체배열 만들기

		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x, y, radius);
			c[i].getArea();
			
		}
		
			if(c[0].getArea() > c[1].getArea() 
					&& c[0].getArea() > c[2].getArea())
			{
				c[0].largeShow();
			}
			else if(c[1].getArea() > c[0].getArea() 
					&& c[1].getArea() > c[2].getArea())
			{
				c[1].largeShow();
			}
			else
				c[2].largeShow();
			
		
		scanner.close();
	}
}
