package ch07;

import java.security.PublicKey;

public class Word {
	private String eng, kor;

	public Word(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}

	public String toString() {
		return kor;
	}
	public String english() {
		return eng;
	}

}
