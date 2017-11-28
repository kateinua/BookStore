package store;

public class Book {
    private String serialNumber;
    private String title;
    private double price;
    private BookSpec spec;

    Book(String serialNumber, String title, double price, BookSpec spec) {
        this.serialNumber = serialNumber;
        this.title = title;
        this.price = price;
        this.spec = spec;
    }

    String getSerialNumber() {
        return serialNumber;
    }
    String getTitle() {
        return title;
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
