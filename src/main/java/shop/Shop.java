package shop;

import instruments.ISell;

import java.util.ArrayList;


public class Shop {

    private String name;
    private Double till;
    private ArrayList<ISell> stock;
    private ArrayList<IShop> customers;

    public Shop(String name, Double till, ArrayList<ISell> stock, ArrayList<IShop> customers) {
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<ISell>();
        this.customers = new ArrayList<IShop>();
    }


    public Double calculateTotalMargin(){
        Double margin = 0.00;
        for(ISell item : stock) {
            margin += item.calculateMarkUp();
        }
        return margin;
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

    public void receivePayment(Double cashPaid){

        till = till + cashPaid;
    }

    public void makePayment(Double cashPaid){

        till = till - cashPaid;
    }

    public int countCustomers(){
        return customers.size();}

    public void addCustomer(IShop customer){
        customers.add(customer);
    }

    public void clearStock(){
        stock.clear();
    }

    public String getName() {
        return name;
    }

    public Double getTill() {
        return till;
    }

}
