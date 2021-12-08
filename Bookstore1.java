public class BookStore 
	{
	private String bookName;
	private int bookPrice;
	private String bookCategory;
	public BookStore(String bookName,int bookPrice, String bookCategory)
	{
	this.bookName=bookName;
	this.bookPrice=bookPrice;
	this.bookCategory=bookCategory;
	}
	public String getBookName()
	{
	return bookName;
	}
	public void setBookName(String bookName) 
	{
	this.bookName = bookName;
	}
	public int getBookPrice() {
	return bookPrice;
	}
	public void setBookPrice(int bookPrice)
	{
	this.bookPrice = bookPrice;
	}
	public String getBookCategory()
	{
	return bookCategory;
	}
	public void setBookCategory(String bookCategory) 
	{
	this.bookCategory = bookCategory;
	}
	public void discount()
	{
	}
	@Override
	public String toString() {
	return "BookSellerShop [bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookCategory=" + bookCategory + "]";
	}
	}

