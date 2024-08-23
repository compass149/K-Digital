package ch05;

public class BNamedCircle extends BCircle{
	private String name;
	private int radius;
	public BNamedCircle(int radius, String name) {
		super(radius);
	}
	private void show() {
		System.out.println(String.format("%s, 반지름 = %s",name, radius));
	}
	public static void main(String[] args) {
		BNamedCircle w = new BNamedCircle(5, "waffle");
		w.show();
	}

}
