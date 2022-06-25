import instruments.InstrumentType;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone(InstrumentType.WOODWIND, "bronze", "brass", 750.00, 1000.00, "Alto");
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.WOODWIND, saxophone.getInstrumentType());
    }

    @Test
    public void hasColour(){
        assertEquals("bronze", saxophone.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("brass", saxophone.getMaterial());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(750.00, saxophone.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(1000.00, saxophone.getSellingPrice(), 0.0);
    }

    @Test
    public void hasPianoType(){
        assertEquals("Alto", saxophone.getSaxophoneType());
    }

    @Test
    public void canPlay(){
        assertEquals("SAAAAX noises", saxophone.playInstrument());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(250.00, saxophone.calculateMarkUp(), 0.0);
    }
}
