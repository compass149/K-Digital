package ch04Ex;

public class Song {
	private String title;
	private String artist;
	private int year;
	private String country;

	public Song() {

	}

	public Song(String t, String a, int y, String c) {
		title = t;
		artist = a;
		year = y;
		country = c;
	}
	
	public void show() {
		System.out.println(String.format("%s년 %s국적의 %s가 부른 %s", year,country,artist,title));
	}

}
