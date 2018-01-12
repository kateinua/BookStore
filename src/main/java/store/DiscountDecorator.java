package store;

public class DiscountDecorator extends CartDecorator {
    public DiscountDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public double getTotalPrice() {
        System.out.println("You get 15% off this purchase");
        return cart.getTotalPrice()*0.85;
    }
}
