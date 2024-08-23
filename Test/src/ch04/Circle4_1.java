package ch04;

public class Circle4_1 {
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		Circle4_1 pizza;
		pizza = new Circle4_1();
		pizza.radius=10;
		pizza.name="자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 "+area);
		
		Circle4_1 doughnut;
		doughnut = new Circle4_1();
		doughnut.radius=2;
		doughnut.name="자바도넛";
		area = doughnut.getArea();
		System.out.println(doughnut.name+ "의 면적은 "+area);
	}
}
