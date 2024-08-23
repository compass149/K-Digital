package ch04Ex;

public class Grade
{
	private int subjct1;
	private int subjct2;
	private int subjct3;
	
	public Grade(int subjct1,int subjct2,int subjct3)
	{
		this.subjct1 = subjct1;
		this.subjct2 = subjct2;
		this.subjct3 = subjct3;
		
	
	}
	public int average()
	{
		
		return (subjct1+subjct2+subjct3)/3;
	}
}
