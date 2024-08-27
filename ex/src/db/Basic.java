package db;

public class Basic {

	public static void main(String[] args){
		
		
		//1.개별객체
		//new BookStore().getBookList();
		//new BookStore().getDB_CustomerList();
		//new BookStore().getBookList();
		//new BookStore().getCustomerList();
		
		//2.1개 객체
		BookStore bs1 = new BookStore();
		
		bs1.conn();
		bs1.getBookList();
		bs1.conn();
		bs1.getCustomerList();
		
		System.out.println("배열출력");
		bs1.BookArr(); //배열 출력
		bs1.conn();
		bs1.CustArr();
		
		
		//4.객체 배열 출력 메소드 호출(방법 2가지)
		bs1.printBookObjArr();
		
		for(int i=0; i<bs1.getBookArr().length; i++)
		{
			bs1.getBookArr()[i].printBook();
		}
		System.out.println();
		
		Book bookArr1[] = bs1.getBookArr();
		for(int i=0; i<bs1.getBookArr().length; i++) {
			bookArr1[i].printBook();
		}
		
		//4.객체배열
		
		//bs1.conn();
		//bs1.getCustomerList();
		
		//bs1.conn();
		//bs1.getBookList();
	}

}
