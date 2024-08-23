package ch03;

public class Q2 {

	public static void main(String[] args) {
		int n[][] = {{1},{1, 2, 3},{1},{1, 2, 3,4 },{1, 2}};
		for(int i =0;  i<n.length; i++) {
			int rn[]  = n[i];
			for (int cn = 0; cn <rn.length; cn++) {
				System.out.print(rn[cn] +" ");
			}
			System.out.println();
		}
	}
}
