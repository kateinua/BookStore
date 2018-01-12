package store;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ObserverTest {

    private Observable observer;
    private Observer testObserver;

    @Before
    public void setUp() throws Exception {
        observer = new Observable();
    }

    @Test
    public void addObserver() throws Exception {
        observer.addObserver(testObserver);
        ArrayList<Observer> testObs = new ArrayList<>();
        testObs.add(testObserver);
        assertEquals(observer.observers, testObs);
    }

    @Test
    public void removeObserver() throws Exception {
        ArrayList<Observer> testObs = new ArrayList<>();
        observer.removeObserver(testObserver);
        assertEquals(observer.observers, testObs);
    }

    @Test
    public void notifyObservers() throws Exception {
        Seller seller = new Seller("Seller");
        Customer customer = new Customer("Customer");

        observer.addObserver(seller);
        observer.addObserver(customer);

        observer.notifyObservers();

        assertEquals(seller.getName(), "Seller");
    }
}