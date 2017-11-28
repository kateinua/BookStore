package store;

import org.junit.Test;

import static org.junit.Assert.*;

public class LanguageTest {
    @Test
    public void testToString() throws Exception {
        Language english = Language.ENGLISH;
        Language ukrainian = Language.UKRAINIAN;

        assertEquals(english.toString(), "English");
        assertEquals(ukrainian.toString(), "Ukrainian");
    }
}