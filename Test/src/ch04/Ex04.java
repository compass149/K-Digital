package ch04;

public class Ex04 {

	public static void main(String[] args) {
	
		Book4_4 littlePrince = new Book4_4("어린왕자", "생텍쥐페리");
		Book4_4 loveStory = new Book4_4("춘향전");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}
