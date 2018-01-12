package store;

public class CashPayment implements PaymentStrategy {
    @Override
    public boolean pay(double price) {
        System.out.format("Cash payment of %d received", price);
        return true;
    }
}
