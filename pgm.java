package sample;

public class StudentAssgn 
{
private String bookname;
private String authorname;
private int bookcost;
private int yearofpublish;
private boolean isABSEnabled;

public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getAuthorname() {
	return authorname;
}
public void setAuthorname(String authorname) {
	this.authorname = authorname;
}
public int getBookcost() {
	return bookcost;
}
public void setBookcost(int bookcost) {
	this.bookcost = bookcost;
}
public int getYearofpublish() {
	return yearofpublish;
}
public void setYearofpublish(int yearofpublish) {
	this.yearofpublish = yearofpublish;
}
public boolean isABSEnabled() {
	return isABSEnabled;
}
public void setABSEnabled(boolean isABSEnabled) {
	this.isABSEnabled = isABSEnabled;
}
@Override
public String toString() {
	return "StudentAssgn [bookname=" + bookname + ", authorname=" + authorname + ", bookcost=" + bookcost
			+ ", yearofpublish=" + yearofpublish + ", isABSEnabled=" + isABSEnabled + "]";
}