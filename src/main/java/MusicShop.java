import behaviours.ISell;

import java.util.ArrayList;
import java.util.Collection;

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
        return null;
    }

    @Override
    public Double getBuyingPrice() {
        return null;
    }

    @Override
    public Double getSellingPrice() {
        return null;
    }
}
