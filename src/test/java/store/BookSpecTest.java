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
        assertTrue(bookSpec.getGenre() == Genre.DRAMA);
        assertTrue(bookSpec.getGenre().toString().equals("Drama"));
    }

    @Test
    public void testType() {
        assertTrue(bookSpec.getType() == Type.PAPERBACK);
        assertTrue(bookSpec.getType().toString().equals("Paperback"));
    }

    @Test
    public void testLanguage() {
        assertTrue(bookSpec.getLanguage() == Language.ENGLISH);
        assertTrue(bookSpec.getLanguage().toString().equals("English"));
    }

    @Test
    public void matches() throws Exception {

        assertTrue(bookSpec.matches(bookSpecTestTrue));
        assertFalse(bookSpec.matches(bookSpecTestFalse));
    }
}