package ch05;

public class GoodCalc extends Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int subtract(int a, int b) {
		return a - b;
	}
	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i<a.length; i++)
			sum += a[i];
		return sum/a.length;
	}
}
