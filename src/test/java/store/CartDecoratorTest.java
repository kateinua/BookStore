package store;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CartDecoratorTest {

    private Cart cart;
    private BonusDecorator bonusCart;
    private DiscountDecorator discountCart;

    @Before
    public void setUp() throws Exception {
        cart = new Cart();
        BookSpec testSpec = new BookSpec("Author", Genre.DRAMA, Type.PAPERBACK, Language.UKRAINIAN);
        Book testBook = new Book("A1", "Title", 10.00, testSpec);
        CashPayment payment = new CashPayment();
        cart.setPaymentStrategy(payment);
        DeliveryDHL delivery = new DeliveryDHL();
        cart.setDeliveryStrategy(delivery);
        cart.addBook(testBook);

        bonusCart = new BonusDecorator(cart);
        discountCart = new DiscountDecorator(cart);
    }

    @Test
    public void testBonus() throws Exception {
        assertEquals(bonusCart.ship(), true);
        assertEquals(bonusCart.getDeliveryStrategy(), cart.getDeliveryStrategy());
        assertEquals(bonusCart.getPaymentStrategy(), cart.getPaymentStrategy());
    }

    @Test
    public void testDiscount() throws Exception {
        assertTrue(discountCart.getTotalPrice() == cart.getTotalPrice()*0.85);
        assertEquals(discountCart.getDeliveryStrategy(), cart.getDeliveryStrategy());
        assertEquals(discountCart.getPaymentStrategy(), cart.getPaymentStrategy());
    }
}