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
        book = new Book("AA1010", "Much Drama", 10.00, bookSpec);
    }
    @Test
    public void testSerialNumber() {
        assertEquals(book.getSerialNumber(), "AA1010");
        assertNotEquals(book.getSerialNumber(), "aa1010");
    }
    @Test
    public void testTitle() {
        assertEquals(book.getTitle(), "Much Drama");
        assertNotEquals(book.getTitle(), "much drama");
    }
    @Test
    public void testPrice() {
        assertTrue(book.getPrice() == 10.00);
        assertFalse(book.getPrice() == 9);
    }
    @Test
    public void testSpec() {
        assertEquals(book.getSpec(), bookSpec);
    }
}