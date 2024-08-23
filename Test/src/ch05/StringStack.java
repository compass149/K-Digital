package ch05;

public class StringStack implements Stack 
{
//1. 멤버변수 정의부터 하기
	private int capacity;
	private String[] words; 
	private int top;
	
	public StringStack(int capacity)
	{
		words = new String[capacity];
		top = -1;
	}
	
	@Override
	public int length() 
	{
		return top+1;
	}

	@Override
	public int capacity() 
	{
		return words.length;
	}

	@Override
	public boolean push(String val) {
		if(top == words.length-1) {
			return false;
		}
		else {
			top++;
			words[top] = val;
			return true;
		}
	}
	
	@Override
	public String pop() {
		if(top == -1)
			return null;
		else {
			String val = words[top];
			top--;
			return val;
			
			//또는 return words[top--];
		}
	}
	
	public void run() {
		
	}

}
