package ch05;

class SmartPhone extends Calc implements PhoneInterface{
	
	@Override
	public void sendCall() {
		System.out.println("전화벨 소리");
	}
	
	@Override
	public void receiveCall() {
		System.out.println("전화가 았습니다.");
	}
	
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}
