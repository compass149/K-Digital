package ch04;

public class Circle //클래스 정의(define)
{
	int radius; //멤버변수 선언(declare) - 메소드 안에서 사용
	String name; //멤버변수
	//멤버 변수는 필드라고도 한다. cf)지역변수와 비교
	//System.out.println(radius); 여기서는 사용 불가 - 클래스 안에서는 '만들기'만 사용 가능 
										      //- 메소드 안에서 클래스의 멤버변수 사용 가능함
	
	public double getArea() //(멤버)메소드 정의(define)
	{
		return 3.14*radius*radius;
	}
}
