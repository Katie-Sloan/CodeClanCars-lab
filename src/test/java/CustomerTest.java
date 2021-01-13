import cars.TradCar;
import cars.TransmissionType;
import engine.CarEngine;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    TradCar car;
    CarEngine engine;

    @Before
    public void setUp() {
        customer = new Customer(10000.00);
        car = new TradCar("Fiat", "500L", 8000.00, "Red", engine, 4, 100, TransmissionType.AUTOMATIC, 55);
    }

    @Test
    public void customerCanBuyCar(){
        customer.buyCar(car);
        assertEquals(1, customer.noOfOwnedCars());
    }

    @Test
    public void customerHasPaidForCar(){
        customer.buyCar(car);
        assertEquals(2000.00, customer.getWallet(), 0.1);
    }
}
