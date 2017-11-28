package store;

import org.junit.Test;

import static org.junit.Assert.*;

public class GenreTest {

    @Test
    public void testToString() throws Exception {
        Genre comedy = Genre.COMEDY;
        Genre drama = Genre.DRAMA;
        Genre horror = Genre.HORROR;
        Genre romance = Genre.ROMANCE;
        Genre fantasy = Genre.FANTASY;
        Genre crime = Genre.CRIME;

        assertEquals(comedy.toString(), "Comedy");
        assertEquals(drama.toString(), "Drama");
        assertEquals(horror.toString(), "Horror");
        assertEquals(romance.toString(), "Romance");
        assertEquals(fantasy.toString(), "Fantasy");
        assertEquals(crime.toString(), "Crime");
    }
}