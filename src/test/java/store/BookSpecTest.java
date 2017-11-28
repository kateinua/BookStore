package store;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookSpecTest {

    private BookSpec bookSpec;
    private BookSpec bookSpecTestTrue;
    private BookSpec bookSpecTestFalse;

    @Before
    public void setUp() throws Exception {
        bookSpec = new BookSpec("Cindy K", Genre.DRAMA, Type.PAPERBACK, Language.ENGLISH);
        bookSpecTestTrue = new BookSpec("Cindy K", Genre.DRAMA, Type.PAPERBACK, Language.ENGLISH);
        bookSpecTestFalse = new BookSpec("Cindy", Genre.DRAMA, Type.PAPERBACK, Language.ENGLISH);
    }

    @Test
    public void testAuthor() {
        assertTrue(bookSpec.getAuthor().equals("Cindy K"));
    }
    @Test
    public void testGenre() {
        assertEquals(bookSpec.getGenre(), Genre.DRAMA);
        assertEquals(bookSpec.getGenre().toString(), "Drama");
    }

    @Test
    public void testType() {
        assertEquals(bookSpec.getType(),  Type.PAPERBACK);
        assertEquals(bookSpec.getType().toString(), "Paperback");
    }

    @Test
    public void testLanguage() {
        assertEquals(bookSpec.getLanguage(), Language.ENGLISH);
        assertEquals(bookSpec.getLanguage().toString(), "English");
    }

    @Test
    public void matches() throws Exception {

        assertTrue(bookSpec.matches(bookSpecTestTrue));
        assertFalse(bookSpec.matches(bookSpecTestFalse));
    }
}