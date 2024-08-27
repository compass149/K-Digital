package db;

public class Customer {
	private int custId;
	private String name;
	private String address;
	private String tel;
	
	
	public void printCust() {
		System.out.print(custId +"\t");
		System.out.print(name +"\t");
		System.out.print(address +"\t");
		System.out.println(tel +"\t");
	}
	
	public int getCustId() {
		return custId;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getTel() {
		return tel;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	
	
}
