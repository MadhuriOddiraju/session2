package spring;

public class LibraryCategory {
	private String libCategory;
	 private int libEntryFee;
	public LibraryCategory(String libCategory, int libEntryFee) {
		super();
		this.libCategory = libCategory;
		this.libEntryFee = libEntryFee;
	}
	public LibraryCategory()
	{
		libCategory="private";
		libEntryFee=100;
	}
	public String getLibCategory() {
		return libCategory;
	}
	public void setLibCategory(String libCategory) {
		this.libCategory = libCategory;
	}
	public int getLibEntryFee() {
		return libEntryFee;
	}
	public void setLibEntryFee(int libEntryFee) {
		this.libEntryFee = libEntryFee;
	}
	@Override
	public String toString() {
		return "LibraryCat [libCategory=" + libCategory + ", libEntryFee=" + libEntryFee + "]";
	}
	 
	 
}
