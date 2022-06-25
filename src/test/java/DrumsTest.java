import instruments.Drums;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums(InstrumentType.PERCUSSION, "black", "wood", 500.00, 750.00, 5);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.PERCUSSION, drums.getInstrumentType());
    }

    @Test
    public void hasColour(){
        assertEquals("black", drums.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", drums.getMaterial());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(500.00, drums.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(750.00, drums.getSellingPrice(), 0.0);
    }

    @Test
    public void hasNumberOfPieces(){
        assertEquals(5, drums.getNumberOfPieces());
    }

    @Test
    public void canPlay(){
        assertEquals("rat tat tat", drums.playInstrument());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(250.00, drums.calculateMarkUp(), 0.0);
    }
}
