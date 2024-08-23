package ch04book;

public class Player {
	String name;
	
	public void getWordFromUser(){
		//사용자로부터 단어를 입력 받음
	}
	
	public void checkSuccess() {
		//끝말잇기의 성공여부와 게임을 계속하는지 판별하는 메소드
		
		String word = "아버지";
		int lastIndex = word.length()-1;
		char lastChar = word.charAt(lastIndex);
		char firstChar= word.charAt(0);
	}

}
