package store;

public class Privat24Payment implements PaymentStrategy {
    @Override
    public boolean pay(double price) {
        System.out.printf("Privat24 payment of %f approved\n", price);
        return true;
    }
}
