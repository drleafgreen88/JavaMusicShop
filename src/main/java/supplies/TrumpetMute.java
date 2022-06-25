package supplies;

import behaviours.ISell;

public class TrumpetMute implements ISell {

    private Double buyingPrice;
    private Double sellingPrice;
    private String muteType;

    public TrumpetMute(Double buyingPrice, Double sellingPrice, String muteType) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.muteType = muteType;
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

    public String getMuteType() {
        return muteType;
    }
}
