package assig;

import java.util.Arrays;
import java.util.List;

public class Main 
	{
	public static void main(String[] args)
	{
	BookStore b = new BookStore("Circe",500,"Fantasy");
	BookStore b1 = new BookStore("Ninth House",600,"Fantasy");
	BookStore b2 = new BookStore("The Help",700,"Fiction");
	BookStore b3 = new BookStore("One Hundred Years of Solitude",400,"Fiction");
	BookStore b4 = new BookStore("The Ninth Fire",300,"Mystery");
	BookStore b5 = new BookStore("The Advantures of Sherloch Holmes",800,"Mystery");
	
	List<BookStore> booksList = Arrays.asList(b,b1,b2,b3,b4,b5);
	
	for(BookStore books : booksList)
	{
		System.out.println(books.getBookName());
	}
	}
	}