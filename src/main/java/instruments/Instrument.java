package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private InstrumentType instrumentType;
    private String colour;
    private String material;
    private Double buyingPrice;
    private Double sellingPrice;

    public Instrument(InstrumentType instrumentType, String colour, String material, Double buyingPrice, Double sellingPrice) {
        this.instrumentType = instrumentType;
        this.colour = colour;
        this.material = material;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public Double getBuyingPrice() {
        return buyingPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public Double calculateMarkUp(){
        return sellingPrice - buyingPrice;
    }
}
