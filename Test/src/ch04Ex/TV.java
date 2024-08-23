package ch04Ex;

public class TV {
	private String name = "";
	public int year = 2000;
	public int inch = 12;

	public TV(String name, int year, int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;

	}

	public void show() {

		System.out.println(String.format("%s에서 만든 %s년형 %s인치 TV", name, year, inch));
	}

}
