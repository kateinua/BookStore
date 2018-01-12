package store;

public class BonusDecorator extends CartDecorator {
    public BonusDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public boolean ship() {
        // adds the giftcard to the shipment
        System.out.println("You get a 15% discount on your next purchase");
        return true;
    }
}
