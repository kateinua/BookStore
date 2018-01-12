package store;

import java.util.ArrayList;

public interface CartInterface {
    boolean ship();
    double getTotalPrice();
    ArrayList<Book> getBooks();
    void setDeliveryStrategy(DeliveryStrategy deliveryStrategy);
    void setPaymentStrategy(PaymentStrategy paymentStrategy);
    DeliveryStrategy getDeliveryStrategy();
    PaymentStrategy getPaymentStrategy();
    void addBook(Book book);
}
