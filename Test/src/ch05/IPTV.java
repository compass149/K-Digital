package ch05;

public class IPTV extends ColorTV {
	private String address;

	public IPTV(String address, int  size, int color) {
		
		super(size, color);
		this.address = address;
	}
	public void printProperty() {
		System.out.println
		(String.format("나의 IPTV는 %s 주소의 %s인치 %s컬러",
				address,getSize(),color));
	}
}
