package ch07;

import java.util.Scanner;
import java.util.Vector;

public class Ex01ppt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			Vector<Double> d = new Vector<Double>();
			for(int i=0; i<5; i++) {
				double num = scanner.nextDouble();
				d.add(num);
			}
			double big = d.get(0);
			for(int i = 1; i<d.size(); i++) {
				
				if(big < d.get(i))
				{
					big = d.get(i);
				}
				
			}
			System.out.println("가장 큰 수는 " + big);
		scanner.close();
	}
}
