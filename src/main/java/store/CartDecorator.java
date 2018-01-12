package store;

import java.util.ArrayList;

public class CartDecorator implements CartInterface {

    Cart cart;

    CartDecorator(Cart cart) {
        this.cart = cart;
    }

    void cartDecorator(Cart cart) {
        this.cart = cart;
    }

    @Override
    public boolean ship() {
        return cart.ship();
    }

    @Override
    public double getTotalPrice() {
        return cart.getTotalPrice();
    }

    @Override
    public ArrayList<Book> getBooks() {
        return cart.getBooks();
    }

    @Override
    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        cart.setDeliveryStrategy(deliveryStrategy);
    }

    @Override
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        cart.setPaymentStrategy(paymentStrategy);
    }

    @Override
    public DeliveryStrategy getDeliveryStrategy() {
        return cart.getDeliveryStrategy();
    }

    @Override
    public PaymentStrategy getPaymentStrategy() {
        return cart.getPaymentStrategy();
    }

    @Override
    public void addBook(Book book) {
        cart.addBook(book);
    }
}
