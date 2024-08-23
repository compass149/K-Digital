package ch05;

public class ColorTV extends TV {

	protected int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	
	public void printProperty() {
		System.out.println(String.format("%s인치 %s컬러", getSize(), color));
	}
}
