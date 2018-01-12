package store;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CartTest {

    private Cart cart;
    private Book testBook;
    private DeliveryNovaPoshta delivery;
    private Privat24Payment payment;

    @Before
    public void setUp() throws Exception {
        cart = new Cart();
        BookSpec testSpec = new BookSpec("Author", Genre.DRAMA, Type.PAPERBACK, Language.UKRAINIAN);
        testBook = new Book("A1", "Title", 10.00, testSpec);
        payment = new Privat24Payment();
        cart.setPaymentStrategy(payment);
        delivery = new DeliveryNovaPoshta();
        cart.setDeliveryStrategy(delivery);
        cart.addBook(testBook);
    }

    @Test
    public void ship() throws Exception {
        assertEquals(cart.ship(), true);
    }

    @Test
    public void getTotalPrice() throws Exception {
        assertTrue(cart.getTotalPrice() == 10.00);
    }

    @Test
    public void getBooks() throws Exception {
        ArrayList<Book> testBooks = new ArrayList<>();
        testBooks.add(testBook);

        assertEquals(cart.getBooks(), testBooks);
    }

    @Test
    public void getPaymentStrategy() throws Exception {
        assertEquals(cart.getPaymentStrategy(), payment);
    }

    @Test
    public void getDeliveryStrategy() throws Exception {
        assertEquals(cart.getDeliveryStrategy(), delivery);
    }
}
