import org.junit.Before;
import org.junit.Test;
import supplies.PianoWire;

import static org.junit.Assert.assertEquals;

public class PianoWireTest {

    PianoWire pianoWire;

    @Before
    public void before(){
        pianoWire = new PianoWire(50.00, 75.00, "Yamaha");
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(50.00, pianoWire.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(75.00, pianoWire.getSellingPrice(), 0.0);
    }

    @Test
    public void hasBrand(){
        assertEquals("Yamaha", pianoWire.getBrand());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(25.00, pianoWire.calculateMarkUp(50.00, 75.00), 0.0);
    }
}
