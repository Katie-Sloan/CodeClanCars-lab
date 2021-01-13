import cars.Car;
import cars.TradCar;
import cars.TransmissionType;
import com.sun.xml.internal.ws.api.pipe.Engine;
import engine.CarEngine;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class TradCarTest {
    TradCar tradCar;
    CarEngine engine;

    @Before
    public void setUp(){
        engine = new CarEngine("diesel");
        tradCar = new TradCar ("Fiat", "500L", 8000.00, "Red", engine, 4, 100, TransmissionType.AUTOMATIC, 55);
    }

    @Test
    public void canGetMake() {
        assertEquals("Fiat", tradCar.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("500L", tradCar.getModel());
    }

    @Test
    public void canGetPrice() {
        assertEquals(8000.00, tradCar.getPrice(), 0.01);
    }

    @Test
    public void canGetColour() {
        assertEquals("Red", tradCar.getColour());
    }

    @Test
    public void canGetEngineType() {
        assertEquals("diesel", tradCar.getEngineType());
    }

    @Test
    public void canGetNumberOfTyres() {
        assertEquals(4, tradCar.getNumberOfTyres());
    }

    @Test
    public void canGetNumberOfDoors() {
        assertEquals(4, tradCar.getNumberOfDoors());
    }

    @Test
    public void canGetTopSpeed() {
        assertEquals(100, tradCar.getTopSpeed());
    }

    @Test
    public void canGetTransmissionType() {
        assertEquals(TransmissionType.AUTOMATIC, tradCar.getTransmissionType());
    }

    @Test
    public void canGetMpg() {
        assertEquals(55, tradCar.getMpg());
    }

}
