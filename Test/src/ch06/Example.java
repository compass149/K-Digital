package ch06;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String s[]= a.split("/");
		for(int i =0; i<s.length; i++)
			System.out.println(s[i]);
		scanner.close();
		
		System.out.println(Integer.parseInt("20"));
		System.out.println(Double.parseDouble("39.5"));
		System.out.println(Boolean.toString(true));
		System.out.println(Integer.parseInt("20"));
		System.out.println(Integer.toBinaryString(50));
	}

}
