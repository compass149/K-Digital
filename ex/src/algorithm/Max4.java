package algorithm;

public class Max4 {

	static int max4(int a, int b, int c, int d) {

		int max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		if (max < d)
			max = d;
		return max;
	}

	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		return min;
	}
	
	static int min4(int a, int b, int c, int d)
	{
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		if (d < min)
			min = d;
		return min;
	}

	public static void main(String[] args) {

		System.out.println("max4 : "+max4(4, 2, 5, 7));
		System.out.println("min3 : "+min3(4, 2, 5));
		System.out.println("min4 : "+min4(4, 2, 5 ,1));
		
	}

}
