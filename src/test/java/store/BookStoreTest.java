package store;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookStoreTest {

    private BookStore bookStore;
    private BookSpec bookSpec;
    private BookSpec bookSpecF;
    private BookSpec bookSpecFalse;
    private Book book;


    @Before
    public void setUp() throws Exception {
        bookStore = new BookStore();
        bookSpec = new BookSpec("Vlad S", Genre.CRIME, Type.HARDCOVER, Language.UKRAINIAN);
        bookSpecF = new BookSpec("Winny", Genre.COMEDY, Type.EBOOK, Language.ENGLISH);
        bookSpecFalse = new BookSpec("Vlad S", Genre.HORROR, Type.AUDIO, Language.UKRAINIAN);
        bookStore.addBook("BB2020", "Who", 20.00, bookSpec);
        bookStore.addBook("FF1234", "Much Funny", 7.00, bookSpecF);

    }
    @Test
    public void getBook() throws Exception {
        assertTrue(bookStore.getBook("BB2020") != null);
        assertTrue(bookStore.getBook("CC2020") == null);
    }

    @Test
    public void search() throws Exception {
        for (Book book : bookStore.search(bookSpecF)) {
            assertEquals(book.getTitle(), "Much Funny");
            assertEquals(book.getPrice(), 7.00);
            assertEquals(book.getSerialNumber(), "FF1234");
            assertEquals(book.getSpec(), bookSpecF);

        }
        for (Book book : bookStore.search(bookSpecFalse)) {
            assertTrue(book == null);
        }
    }
}