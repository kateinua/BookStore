package store;

public class DiscountDecorator extends CartDecorator {
    DiscountDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public double getTotalPrice() {
        System.out.println("You get 15% off this purchase");
        return cart.getTotalPrice()*0.85;
    }
}
