package instruments;

public class Saxophone extends Instrument{

    private String saxophoneType;

    public Saxophone(InstrumentType instrumentType, String colour, String material, Double buyingPrice, Double sellingPrice, String saxophoneType) {
        super(instrumentType, colour, material, buyingPrice, sellingPrice);
        this.saxophoneType = saxophoneType;
    }

    public String getSaxophoneType() {
        return saxophoneType;
    }

    @Override
    public String playInstrument() {
        return "SAAAAX noises";
    }

    @Override
    public Double calculateMarkUp(Double buyingPrice, Double sellingPrice) {
        return null;
    }
}
