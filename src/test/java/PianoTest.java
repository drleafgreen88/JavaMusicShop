import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(InstrumentType.KEYBOARD, "brown", "wood", 1000.50, 1750.75, "Baby Grand");
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getInstrumentType());
    }

    @Test
    public void hasColour(){
        assertEquals("brown", piano.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(1000.50, piano.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(1750.75, piano.getSellingPrice(), 0.0);
    }

    @Test
    public void hasPianoType(){
        assertEquals("Baby Grand", piano.getPianoType());
    }

    @Test
    public void canPlay(){
        assertEquals("bing bong bing", piano.playInstrument());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(750.25, piano.calculateMarkUp(), 0.0);
    }
}
