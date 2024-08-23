package ch05;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

import ch03.ForeachEx;

public class Q9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("총 스택 저장 공간의 크기 입력>>");
		
		int capacity = scanner.nextInt();
		StringStack st = new StringStack(capacity);
		
		//String words[]= new String[capacity];
		while (true)
		{
			System.out.println("문자열 입력>>");
			String word = scanner.next();
			if(word.equals("그만"))
			
				break;
			
			boolean bOK = st.push(word);
			if(!bOK){
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		System.out.println("스택에 저장된 모든 문자열 팝 :" + st.pop());
		int size = st.length();
		for(int i=0; i<size; i++)
		{
			String word =  st.pop();
			System.out.print(word + " ");
		}
		scanner.close();
	}

}
