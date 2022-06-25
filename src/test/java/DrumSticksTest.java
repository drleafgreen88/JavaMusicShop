import org.junit.Before;
import org.junit.Test;
import supplies.DrumSticks;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks(25.50, 50.00, "wood");
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(25.50, drumSticks.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(50.00, drumSticks.getSellingPrice(), 0.0);
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", drumSticks.getMaterial());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(24.50, drumSticks.calculateMarkUp(25.50, 50.00), 0.0);
    }
}
