package store;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookStoreTest {

    private BookStore bookStore;
    private BookSpec bookSpec;
    private BookSpec bookSpecF;


    @Before
    public void setUp() throws Exception {
        bookStore = new BookStore();
        bookSpec = new BookSpec("Vlad S", Genre.CRIME, Type.HARDCOVER, Language.UKRAINIAN);
        bookSpecF = new BookSpec("Winny", Genre.COMEDY, Type.EBOOK, Language.ENGLISH);
        bookStore.addBook("BB2020", "Who", 20.00, bookSpec);
        bookStore.addBook("FF1234", "Much funny", 7.00, bookSpecF);

    }
    @Test
    public void getBook() throws Exception {
        assertTrue(bookStore.getBook("BB2020") != null);
        assertTrue(bookStore.getBook("CC2020") == null);
    }

    @Test
    public void search() throws Exception {
        for (Book book: BookStore.search(bookSpecF)) {
            assertTrue(book.getTitle().equals("Much Funny"));
            assertTrue(book.getPrice() == 7.00);
            assertTrue(book.getSerialNumber().equals("FF1234"));
            assertTrue(book.getSpec() == bookSpecF);
        }
    }
}