import cars.Car;
import cars.TradCar;
import cars.TransmissionType;
import engine.CarEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TradCarTest {
    TradCar tradCar;
    CarEngine engine;

    @Before
    public void setUp(){
        tradCar = new TradCar ("Fiat", "500L", 8000.00, "Red", engine, 4, 100, TransmissionType.AUTOMATIC, 55);
    }

    @Test
    public void canGetMake() {
        assertEquals("Fiat", tradCar.getMake());
    }
}
