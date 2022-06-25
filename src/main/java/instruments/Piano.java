package instruments;

public class Piano extends Instrument{

    private String pianoType;

    public Piano(InstrumentType instrumentType, String colour, String material, Double buyingPrice, Double sellingPrice, String pianoType) {
        super(instrumentType, colour, material, buyingPrice, sellingPrice);
        this.pianoType = pianoType;
    }

    public String getPianoType() {
        return pianoType;
    }

    @Override
    public String playInstrument() {
        return "bing bong bing";
    }

    @Override
    public Double calculateMarkUp(Double buyingPrice, Double sellingPrice) {
        return null;
    }
}
