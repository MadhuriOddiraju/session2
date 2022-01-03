package spring;

public class Book {
	
	  private String bookName;
	  private int bookId;
	public Book(String bookName, int bookId) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
	}
	public Book()
	{
		bookName="TwoStates";
		bookId=1;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getbookId() {
		return bookId;
	}
	public void setbookId(int bookId) {
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookId=" + bookId + "]";
	}


	  
}
