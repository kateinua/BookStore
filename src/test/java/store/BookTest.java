package store;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    private BookSpec bookSpec;
    private Book book;

    @Before
    public void setUp() throws Exception {
        bookSpec = new BookSpec("Cindy K", Genre.DRAMA, Type.PAPERBACK, Language.ENGLISH);
        book = new Book("AA1010", "Much drama", 10.00, bookSpec);
    }
    @Test
    public void testSerialNumber() {
        assertTrue(book.getSerialNumber().equals("AA1010"));
    }
    @Test
    public void testTitle() {
        assertTrue(book.getTitle().equals("Much Drama"));
    }
    @Test
    public void testPrice() {
        assertTrue(book.getPrice() == 10.00);
    }
    @Test
    public void testSpec() {
        assertTrue(book.getSpec() == bookSpec);
    }
}