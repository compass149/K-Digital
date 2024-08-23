package ch05.ex13;

public class Ex13 {

	public static void main(String[] args) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("면적은 " +donut.getArea());
		
		Shape [] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20,30);
		list[2] = new Rect(10,40);

		for (int i = 0; i<list.length; i++)
			list[i].redraw();
		for(int i=0; i<list.length; i++)
			System.out.println("면적은 " +list[i].getArea());
	}
}
