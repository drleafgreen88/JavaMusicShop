import behaviours.ISell;

import java.util.ArrayList;

public class MusicShop implements ISell {

    private ArrayList<ISell> stock;

    public MusicShop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addItem(ISell item){
        stock.add(item);
    }

    public void removeItem(ISell item){
        stock.remove(item);
    }

    public double calculateTotalProfit(){
        double total = 0;

        for (ISell item : stock){
            total += item.calculateMarkUp(item.getSellingPrice(), item.getBuyingPrice());
        }
        return total;
    }

    @Override
    public Double calculateMarkUp(Double buyingPrice, Double sellingPrice) {
        return sellingPrice - buyingPrice;
    }

    @Override
    public Double getBuyingPrice() {
        return getBuyingPrice();
    }

    @Override
    public Double getSellingPrice() {
        return getSellingPrice();
    }
}
