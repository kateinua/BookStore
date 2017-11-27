package store;

import java.util.ArrayList;
import java.util.Iterator;

public class BookStore {
    private ArrayList<Book> books;

    public BookStore() {
        books = new ArrayList<>();
    }

    public void addBook(String serialNumber, double price, BookSpec bookSpec) {
        Book book = new Book(serialNumber, price, bookSpec);
        books.add(book);
    }
    public Book getBook(String serialNumber) {
        for (Book book : books) {
            if (book.getSerialNumber().equals(serialNumber)) {
                return book;
            }
        }
        return null;
    }
    public ArrayList<Book> search(BookSpec searchSpec) {
        ArrayList<Book> matchingBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getSpec().matches(searchSpec)) {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }
}
