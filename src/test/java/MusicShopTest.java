import behaviours.ISell;
import instruments.*;
import org.junit.Before;
import org.junit.Test;
import supplies.DrumSticks;
import supplies.PianoWire;
import supplies.TrumpetMute;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    Drums drums;
    Piano piano;
    Saxophone saxophone;
    Trumpet trumpet;

    DrumSticks drumSticks;
    PianoWire pianoWire;
    TrumpetMute trumpetMute;

    ArrayList <ISell> stock;

    MusicShop musicShop;

    @Before
    public void before(){
        drums = new Drums(InstrumentType.PERCUSSION, "red", "steel", 1500.00, 2000.00, 10);
        piano = new Piano(InstrumentType.KEYBOARD, "black", "wood", 5000.00, 7500.00, "Grand");
        saxophone = new Saxophone(InstrumentType.WOODWIND, "silver", "brass", 1000.00, 1400.00, "Soprano");
        trumpet = new Trumpet(InstrumentType.BRASS, "gold", "brass", 750.00, 1000.00, "Piccolo");

        drumSticks = new DrumSticks(25.00, 40.00, "Plastic");
        pianoWire = new PianoWire(250.00, 400.00, "Millard");
        trumpetMute = new TrumpetMute(10.00, 15.00, "Plunger");

        stock = new ArrayList<>();

        stock.add(trumpet);
        stock.add(drums);
        stock.add(pianoWire);
        stock.add(drumSticks);

        musicShop = new MusicShop(stock);
    }

    @Test
    public void hasInventory(){
        assertEquals(4, musicShop.getStock().size());
    }

    @Test
    public void canAddItem(){
        musicShop.addItem(trumpet);
        assertEquals(5, musicShop.getStock().size());
    }

    @Test
    public void canRemoveItem(){
        musicShop.addItem(saxophone);
        assertEquals(5, musicShop.getStock().size());
        musicShop.removeItem(saxophone);
        assertEquals(4, musicShop.getStock().size());
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(3820.00, musicShop.calculateTotalProfit(), 0.0);
    }
}
