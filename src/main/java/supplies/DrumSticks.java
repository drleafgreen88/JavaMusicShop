package supplies;

import behaviours.ISell;

public class DrumSticks implements ISell {

    private Double buyingPrice;
    private Double sellingPrice;
    private String material;

    public DrumSticks(Double buyingPrice, Double sellingPrice, String material) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.material = material;
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

    public String getMaterial() {
        return material;
    }
}
