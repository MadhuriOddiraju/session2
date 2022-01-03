package spring;

public class BookLibrary {

	private String libraryName;
	private int libraryId;

	public BookLibrary(String libraryName, int libraryId) {
		super();
		this.libraryName = libraryName;
		this.libraryId = libraryId;
	}

	public BookLibrary() {
		libraryName = "ScienceLib";
		libraryId = 100;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public int getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	@Override
	public String toString() {
		return "Library [libraryName=" + libraryName + ", libraryId=" + libraryId + "]";
	}
}