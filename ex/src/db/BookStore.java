package db;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookStore {
	private Connection con; // db관련 멤버변수
	private Statement stmt;
	private ResultSet rs;

	// 1.멤버변수 (저장용)
//	1. 변수  => 한 권씩만 담을 수 있음. (한번에 n개를 담으려면 변수로는 불가함)

	private int bookid;
	private String bookname;
	private String publisher;
	private int price;

	private int custId;
	private String name;
	private String address;
	private String tel;

//	2. 배열 id 10개, 제목 10개 등 이렇게 따로 저장
	private int bookidArr[];
	private String booknameArr[];
	private String publisherArr[];
	private int priceArr[];
	
	private int custIdArr[];
	private String nameArr[];
	private String addressArr[];
	private String telArr[];

//	3. 객체 객체 1개에 아이디, 제목, 출판사, 가격이 하나로 묶여있음
	private Book book;
	private Customer customer;
//	4. 객체배열
	private Book bookArr[];

	public Book[] getBookArr() { // book배열 반환
		return bookArr;
	}

	public BookStore() { // 생성자
		con = null;
		stmt = null;
		rs = null;

		// 1. 변수
		bookid = 0;
		bookname = "";
		publisher = "";
		price = 0;

		custId = 0;
		name = "";
		address = "";
		tel = "";

		// 2. 배열 (DB에서 가져오는 개수를 모르므로 ArrayList를 사용해야 함)
		// (지금 10개로 설정한 이유는 결과가 10개인 것을 알고있기 때문)
		bookidArr = new int[10];
		booknameArr = new String[10];
		publisherArr = new String[10];
		priceArr = new int[10];
		
		ArrayList<Integer> custId = new ArrayList<Integer>();
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> address = new ArrayList<String>();
		ArrayList<String> tel = new ArrayList<String>();
		

		// 3. 객체 초기화
		book = new Book(); // hasA 관계 (book이라는 객체를 bookstore 객체가 가지고 있음)
		// book에 4가지를 저장해야 함
		customer = new Customer();
		
		// 4.객체배열
		bookArr = new Book[10];
		for (int i = 0; i < bookArr.length; i++) {
			bookArr[i] = new Book(); // 객체 배열 10개도 초기화 해야 함
		}
	}

	public void conn() {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "c##madang"; // c##추가
		String pwd = "c##madang"; // c##추가

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			System.out.println("데이터베이스 연결 준비 .....");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getBookList() { // 메소드
		String query = "SELECT * FROM book";
		try {
			stmt = con.createStatement(); // 2
			rs = stmt.executeQuery(query); // 3
			System.out.println("BOOK ID \tBOOK NAME \tPUBLISHER \tPRICE");

			int index = 0; // 반복문 밖에 선언
			int index2 = 0; // 객체 배열용

			while (rs.next()) { // 결과를 한 줄씩 출력함.
				// 바로 출력하는 것이 아닌, 필요할 때 출력하기 위해 while문 안의 내용을 저장할 필요성이 있음
//				System.out.print("\t" + rs.getInt(1));
//				System.out.print("\t" + rs.getString(2));
//				System.out.print("\t\t\t" + rs.getString(3));
//				System.out.println("\t\t\t\t" + rs.getInt(4));
				// 1.변수
				bookid = rs.getInt(1);
				bookname = rs.getString(2);
				publisher = rs.getString(3);
				price = rs.getInt(4);

				// printBook(); //n번 호출해서 사용

				// 2. 배열
				bookidArr[index] = rs.getInt(1);
				booknameArr[index] = rs.getString(2);
				publisherArr[index] = rs.getString(3);
				priceArr[index] = rs.getInt(4);
				index++;

				// 3. 객체
				book.setBookid(rs.getInt(1));
				book.setBookname(rs.getString(2));
				book.setPublisher(rs.getString(3));
				book.setPrice(rs.getInt(4));

//				System.out.println("객체 출력입니다.");
				// printBookObj(); 객체 출력 -> book객체 안으로 이동
				book.printBook();

				// 4. 객체 배열 저장
				bookArr[index2].setBookid(rs.getInt(1));
				bookArr[index2].setBookname(rs.getString(2));
				bookArr[index2].setPublisher(rs.getString(3));
				bookArr[index2].setPrice(rs.getInt(4));
				index2++;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	// 1.변수 출력용 메소드 생성

	private void printBook() {
		System.out.print(bookid + "\t");
		System.out.print(bookname + "\t");
		System.out.print(publisher + "\t");
		System.out.println(price);
	}

	private void printCust() {
		System.out.print(custId +"\t");
		System.out.print(name + "\t");
		System.out.print(address + "\t");
		System.out.println(tel);
	}

	// 2. 배열 출력용 메소드
	public void BookArr() {
		for (int i = 0; i < bookidArr.length; i++) {
			System.out.print(bookidArr[i] + "\t");
			System.out.print(booknameArr[i] + "\t");
			System.out.print(publisherArr[i] + "\t");
			System.out.println(priceArr[i]);
		}
	}
	public void CustArr() {
		for (int i=0; i<custIdArr.length; i++) {
			System.out.print(custIdArr[i]+"\t");
			System.out.print(nameArr[i]+"\t");
			System.out.print(addressArr[i]+"\t");
			System.out.print(telArr[i]+"\t");
		}
	}

	// 3. 객체 출력용 메소드 -> 객체 안으로 보낸다.
//	private void printBookObj() {
//		System.out.print(book.getBookid() + "\t");
//		System.out.print(book.getBookname() + "\t");
//		System.out.print(book.getPublisher() + "\t");
//		System.out.println(book.getPrice());
//	}

	// 4. 객체배열 출력용 메소드
	public void printBookObjArr() {
		for (int i = 0; i < bookArr.length; i++) {
			System.out.print(bookArr[i].getBookid() + "\t");
			System.out.print(bookArr[i].getBookname() + "\t");
			System.out.print(bookArr[i].getPublisher() + "\t");
			System.out.println(bookArr[i].getPrice() + "\t");
		}
	}

	public void getCustomerList() { // 메소드
		String query = "SELECT * FROM customer";
		try {
			stmt = con.createStatement(); // 2
			rs = stmt.executeQuery(query); // 3
			System.out.println(" ID \t 이름 \t\t 주소 \t\t 전화번호");
			int idx = 0; // 반복문 밖에 선언
			int idx2 = 0; // 객체 배열용 
			
			while (rs.next()) {
				System.out.print("\t" + rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t\t\t" + rs.getString(3));
				System.out.println("\t\t\t\t" + rs.getString(4));

				// 1. 변수
				custId = rs.getInt(1);
				name = rs.getString(2);
				address = rs.getString(3);
				tel = rs.getString(4);

				//2. 배열
				custIdArr[idx] = rs.getInt(1);
				nameArr[idx] = rs.getString(2);
				addressArr[idx] = rs.getString(3);
				telArr[idx] = rs.getString(4);
				idx++;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
