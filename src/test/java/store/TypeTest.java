package store;

import org.junit.Test;

import static org.junit.Assert.*;

public class TypeTest {
    @Test
    public void testToString() throws Exception {
        Type paperback = Type.PAPERBACK;
        Type hardcover = Type.HARDCOVER;
        Type ebook = Type.EBOOK;
        Type audio = Type.AUDIO;

        assertEquals(paperback.toString(), "Paperback");
        assertEquals(hardcover.toString(), "Hardcover");
        assertEquals(ebook.toString(), "E-book");
        assertEquals(audio.toString(), "Audio");
    }
}