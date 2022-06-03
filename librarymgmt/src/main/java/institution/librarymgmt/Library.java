package institution.librarymgmt;

public class Library {
	private String name;
	private String librarian;
	
	private Book[] books = new Book[10];
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLibrarian() {
		return librarian;
		
	}

	public void setLibrarian(String librarian) {
		this.librarian = librarian;
	}
	
	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	public void addBook(Book book,int index) {
		books[index] = book;
	}
	
}

