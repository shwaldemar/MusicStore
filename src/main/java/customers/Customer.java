package customers;

import shop.IShop;

import java.util.ArrayList;

public class Customer implements IShop {

    private String name;
    private String email;
    private Double wallet;
    private ArrayList<IBuy> purchases;

    public Customer(String name, String email, Double wallet, ArrayList<IBuy> purchases) {
        this.name = name;
        this.email = email;
        this.wallet = wallet;
        this.purchases = purchases;

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Double getWallet() {
        return wallet;
    }

    public int countPurchases(){
        return purchases.size();
    }

    public Double payForItem(Double cashPaid){
        wallet = (wallet - cashPaid);
        return wallet;
    }

    public void addItem(IBuy item){
        purchases.add(item);
    }



}
