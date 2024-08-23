package ch04;

public class Book4_5 
{
	String title;
	String author;
	void show() {
		System.out.println(String.format("%s %s", title, author));
	}
	
	public Book4_5() {
		this("", "");
		System.out.println("생성자 호출됨");
	}
	public Book4_5(String title) {
		this(title, "작자미상");
	}
	
	public Book4_5(String title, String author) {
		this.title = title; this.author = author;
	}
}
