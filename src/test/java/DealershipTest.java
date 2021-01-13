import cars.Car;
import cars.HybridCar;
import cars.TradCar;
import cars.TransmissionType;
import engine.CarEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    TradCar tradCar;
    HybridCar hybridCar;
    CarEngine engine;

    @Before
    public void setUp() {
        dealership = new Dealership("CodeClan Cars", 50000.00);
        tradCar = new TradCar("Fiat", "500L", 8000.00, "Red", engine, 4, 100, TransmissionType.AUTOMATIC, 55);
        hybridCar = new HybridCar ("Volkswagen", "Passat", 12000.00, "Black", engine, 2, 110, TransmissionType.AUTOMATIC, 70, 60);
    }

    @Test
    public void canGetName() {
        assertEquals("CodeClan Cars", dealership.getName());
    }

    @Test
    public void stockCountStartsAtZero() {
        assertEquals (0, dealership.stockCount());
    }

    @Test
    public void canGetTillCount() {
        assertEquals(50000.00, dealership.tillCount(), 0.01);
    }

    @Test
    public void canBuyCar() {
        dealership.buyCar(tradCar);
        assertEquals(1, dealership.stockCount());
        assertEquals(42000.00, dealership.tillCount(), 0.01);
    }

    @Test
    public void canFindCar() {
        dealership.buyCar(tradCar);
        dealership.buyCar(hybridCar);
        assertEquals(hybridCar, dealership.findCar("Passat"));
    }

    @Test
    public void canSellCar() {
        dealership.buyCar(tradCar);
        dealership.buyCar(hybridCar);
        dealership.sellCar("Passat");
        assertEquals(1, dealership.stockCount());
        assertEquals(42000.00, dealership.tillCount(), 0.01);
    }

}
