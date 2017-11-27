package store;

public class Book {
    private String serialNumber;
    private double price;
    private BookSpec spec;

    Book(String serialNumber, double price, BookSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    String getSerialNumber() {
        return serialNumber;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    BookSpec getSpec() {
        return spec;
    }
}
