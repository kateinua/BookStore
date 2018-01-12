package store;

public class Privat24Payment implements PaymentStrategy {
    @Override
    public boolean pay(double price) {
        System.out.format("Privat24 payment of %d approved", price);
        return true;
    }
}
