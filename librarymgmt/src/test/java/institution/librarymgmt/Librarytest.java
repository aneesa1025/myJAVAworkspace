package institution.librarymgmt;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Librarytest {

private Library library = null;
	
	@Before
	public void setup() {
		library = new Library();
		
	}
	
	@Test
	public void getBooksTest() {
		Book book = new Book();
		book.setBookName("Fundamentals of Digital Electronics");
		book.setPrice(1900);
		
		Book book1 = new Book();
		book1.setBookName("Microprocessor");
		book1.setPrice(1500);
		
		
		library.addBook(book, 0);
		library.addBook(book, 1);
		
		Book[] books = library.getBooks();
		Book b1 = books[0];
		Book b2 = books[1];
		Book b3 = books[2];
		assertTrue(b1.getBookName() != null);
		assertTrue(b2.getBookName() != null);
		assertTrue(b3 ==null);
		
	}

}

	


