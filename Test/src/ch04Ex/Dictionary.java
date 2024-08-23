package ch04Ex;

import java.util.Scanner;

public class Dictionary {
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"}; 
	private static String[] eng = {"love", "baby", "money", "future", "hope"}; 
	public static String kor2eng(String word) 
	{//스캐너로 한글 단어를 입력받는다.
		//입력받은 한글이 kor배열의 몇 번째인지 찾는다.
		//찾은 위치를 반환하고, 반환받은 위치에 해당하는 eng배열의 값을 반환한다.
		//위의 return값을 화면에 print한다.
		
		
		//dicapp 메소드는 사용자가 입력하는 것에 접근하기 위해서 만드는 것.
		Scanner scanner = new Scanner(System.in);
		//그만이 나오기 전까지는 무한 반복해야 하므로 
		while(true)
		{
			System.out.print("한글 단어?");
			String kWord = scanner.next();
			
			
			if(kWord.equals("그만")) {
				scanner.close();
				
			}
			for (int i=0; i< kor.length; i++) {
				if(kWord.equals(kor[i])) {
					System.out.println(String.format("%s은(는) $s",kWord, eng[i]));
				}
			}
		}
	
		
	}
	public void run() {
		// main에서 실행을 누르면 순차적으로 실행되는 내용을 적는다.
		//kor2eng를 실행한다. 
		kor2eng("아기");
		
	}

}
