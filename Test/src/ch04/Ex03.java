package ch04;

public class Ex03{

	public static void main(String[] args) 
	{
		Circle2 pizza = new Circle2(10, "자바피자");
		double area = pizza.getArea();
		System.out.println(String.format("%s의 면적은 %s", pizza.name, area));
		
		Circle2 doughnut = new Circle2();
		doughnut.name = "도넛피자";
		area = doughnut.getArea();
		System.out.println(String.format("%s의 면적은 %s", doughnut.name, area));

	}
}

