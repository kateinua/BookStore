package store;

public class CashPayment implements PaymentStrategy {
    @Override
    public boolean pay(double price) {
        System.out.format("Cash payment of %f received\n", price);
        return true;
    }
}
