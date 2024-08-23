package ch07;

import java.util.Scanner;
import java.util.Vector;

public class WordQuiz { //p.313
	 public static void main(String[] args) {
	        Vector<Word> v = new Vector<Word>();
	        v.add(new Word("love", "사랑"));
	        v.add(new Word("hope", "희망"));
	        v.add(new Word("book", "책"));
	        v.add(new Word("voice", "목소리"));
	        v.add(new Word("coffee", "커피"));
	        v.add(new Word("gold", "금"));
	        v.add(new Word("milk", "우유"));
	        v.add(new Word("bottle", "병"));
	        v.add(new Word("cup", "컵"));
	        v.add(new Word("choice", "선택"));
	        v.add(new Word("dice", "주사위"));
	        v.add(new Word("vet", "수의사"));
	        v.add(new Word("cream", "크림"));
	        v.add(new Word("soap", "비누"));

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("영어 어휘 테스트를 시작합니다. 1~4 외 다른 입력 시 종료합니다.");

	        while (true) {
	            // 문제로 사용할 단어를 랜덤하게 선택
	            int problemIndex = (int) (Math.random() * v.size());
	            Word problemWord = v.get(problemIndex);

	            // 정답 보기 위치를 랜덤하게 선택
	            int correctPosition = (int) (Math.random() * 4);
	            Vector<Word> options = new Vector<Word>();

	            // 보기를 구성
	            for (int i = 0; i < 4; i++) {
	                if (i == correctPosition) {
	                    options.add(problemWord);
	                } else {
	                    int randomIndex;
	                    Word randomWord;
	                    do {
	                        randomIndex = (int) (Math.random() * v.size());
	                        randomWord = v.get(randomIndex);
	                    } while (options.contains(randomWord) || randomIndex == problemIndex);
	                    options.add(randomWord);
	                }
	            }

	            // 문제 출력
	            System.out.println(problemWord.english() + "?");
	            for (int i = 0; i < 4; i++) {
	                System.out.println("(" + (i + 1) + ") " + options.get(i).toString());
	            }

	            int answer = scanner.nextInt();
	            if (answer > 4 || answer < 1) {
	                System.out.println("프로그램을 종료합니다.");
	                break;
	            } else {
	                if (answer - 1 == correctPosition) {
	                    System.out.println("Excellent");
	                } else {
	                    System.out.println("No");
	                }
	            }
	        }
	        scanner.close();
	    }
	}

