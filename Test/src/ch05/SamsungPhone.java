package ch05;

class SamsungPhone implements PhoneInterface {
	@Override
	public void sendCall() {
		System.out.println("전화벨 소리");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}

	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}
