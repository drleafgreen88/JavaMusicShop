package behaviours;

public interface ISell {

    public Double calculateMarkUp(Double buyingPrice, Double sellingPrice);
    public Double getBuyingPrice();
    public Double getSellingPrice();
}
