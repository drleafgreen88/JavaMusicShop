import org.junit.Before;
import org.junit.Test;
import supplies.TrumpetMute;

import static org.junit.Assert.assertEquals;

public class TrumpetMuteTest {

    TrumpetMute trumpetMute;

    @Before
    public void before(){
        trumpetMute = new TrumpetMute(35.00, 70.00, "Cup");
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(35.00, trumpetMute.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(70.00, trumpetMute.getSellingPrice(), 0.0);
    }

    @Test
    public void hasType(){
        assertEquals("Cup", trumpetMute.getMuteType());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(35.00, trumpetMute.calculateMarkUp(35.00, 70.00), 0.0);
    }
}
