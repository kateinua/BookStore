package store;

import java.util.ArrayList;

public class DeliveryDHL implements DeliveryStrategy {
    @Override
    public boolean deliver(ArrayList<Book> books) {
        System.out.println("Your order is being delivered by DHL. " +
                "Here is the list of books you've ordered: ");
        for (Book book : books) {
            System.out.print(book.getTitle() + '\n');
        }
        return true;
    }
}
