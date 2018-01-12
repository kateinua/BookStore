package store;

import java.util.ArrayList;

public class Cart implements CartInterface {
    private ArrayList<Book> books;
    private PaymentStrategy paymentStrategy;
    private DeliveryStrategy deliveryStrategy;

    public boolean ship() {
        if (paymentStrategy.pay(getTotalPrice())) {
            deliveryStrategy.deliver(books);
            return true;
        } else {return false;}
    }

    public double getTotalPrice() {
        int totalPrice = 0;
        for (Book book : this.books) {
            totalPrice += book.getPrice();
        } return totalPrice;
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public PaymentStrategy getPaymentStrategy() {
        return this.paymentStrategy;
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return this.deliveryStrategy;
    }

    public Cart() {
        this.books = new ArrayList<Book>();
    }
}
