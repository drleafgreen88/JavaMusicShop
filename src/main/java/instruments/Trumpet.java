package instruments;

public class Trumpet extends Instrument{

    private String trumpetType;

    public Trumpet(InstrumentType instrumentType, String colour, String material, Double buyingPrice, Double sellingPrice, String trumpetType) {
        super(instrumentType, colour, material, buyingPrice, sellingPrice);
        this.trumpetType = trumpetType;
    }

    public String getTrumpetType() {
        return trumpetType;
    }

    @Override
    public String playInstrument() {
        return "Waa waa";
    }

    @Override
    public Double calculateMarkUp(Double buyingPrice, Double sellingPrice) {
        return null;
    }
}
