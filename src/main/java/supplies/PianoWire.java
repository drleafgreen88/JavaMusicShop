package supplies;

import behaviours.ISell;

public class PianoWire implements ISell {

    private Double buyingPrice;
    private Double sellingPrice;
    private String brand;

    public PianoWire(Double buyingPrice, Double sellingPrice, String brand) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.brand = brand;
    }

    @Override
    public Double calculateMarkUp(Double buyingPrice, Double sellingPrice) {
        return sellingPrice - buyingPrice;
    }

    @Override
    public Double getBuyingPrice() {
        return buyingPrice;
    }

    @Override
    public Double getSellingPrice() {
        return sellingPrice;
    }

    public String getBrand() {
        return brand;
    }
}
