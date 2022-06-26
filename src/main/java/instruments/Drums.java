package instruments;

public class Drums extends Instrument{

    private int numberOfPieces;

    public Drums(InstrumentType instrumentType, String colour, String material, Double buyingPrice, Double sellingPrice, int numberOfPieces) {
        super(instrumentType, colour, material, buyingPrice, sellingPrice);
        this.numberOfPieces = numberOfPieces;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    @Override
    public String playInstrument() {
        return "rat tat tat";
    }

    @Override
    public Double calculateMarkUp(Double buyingPrice, Double sellingPrice) {
        return sellingPrice - buyingPrice;
    }
}
