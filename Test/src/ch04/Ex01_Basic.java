package ch04;

public class Ex01_Basic 
{

	public static void main(String[] args) 
	{
		Circle pizza; //클래스 사용하기
					  //pizza라는 이름의 변수를 만드는 데에 Circle 클래스를 사용
					  //클래스를 사용해서 만들어진 변수 : 객체 cf)int a; 등은 객체가 아님
					  //아직은 pizza 객체를 new로 만들지 않았으므로 '객체'라고 부르기는 미흡함 -'객체변수'라고 부름 -pizza라는 점을 찍음
		
		pizza = new Circle();  
		//           └생성자
		//     	┟ 진짜 객체, 레퍼런스가 포인터로 값을 가리키게 됨 - new로 부른 순간 pizza라는 객체가 만들어짐
		// 객체 사용하기 (.을 찍어서 사용함)
		pizza.radius = 10;
		pizza.name = "자바피자";  //클래스로 객체를 만들고, 객체의 멤버 변수를 사용함
							       // => 객체의 멤버 변수에 값 넣음
		
		double area = pizza.getArea(); //객체의 메소드를 사용
		System.out.println(pizza.name +"의 면적은 " + area);
		
		//circle class로 doughnut 만들기
		Circle doughnut = new Circle();
		doughnut.radius = 2;
		doughnut.name = "자바도넛";
		area = doughnut.getArea();
		System.out.println(doughnut.name +"의 면적은 " + area);
	}
}
