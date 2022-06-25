import instruments.InstrumentType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(InstrumentType.BRASS, "silver", "brass", 800.00, 1200.50, "Bb");
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.BRASS, trumpet.getInstrumentType());
    }

    @Test
    public void hasColour(){
        assertEquals("silver", trumpet.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("brass", trumpet.getMaterial());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(800.00, trumpet.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(1200.50, trumpet.getSellingPrice(), 0.0);
    }

    @Test
    public void hasPianoType(){
        assertEquals("Bb", trumpet.getTrumpetType());
    }

    @Test
    public void canPlay(){
        assertEquals("Waa waa", trumpet.playInstrument());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(400.50, trumpet.calculateMarkUp(), 0.0);
    }
}
