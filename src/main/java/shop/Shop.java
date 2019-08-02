package shop;

import instruments.ISell;

import java.util.ArrayList;


public class Shop {

    private String name;
    private Double till;
    private ArrayList<ISell> stock;

    public Shop(String name, Double till, ArrayList<ISell> stock) {
        this.name = name;
        this.till = till;
        this.stock = stock;
    }


    public int countStock(){
        return stock.size();
    }

    public void addStock(ISell item){
        stock.add(item);
    }

    public void removeStock(ISell item){
        stock.remove(item);
    }

    public void clearStock(){
        stock.clear();
    }

    public String getName() {
        return name;
    }

}
