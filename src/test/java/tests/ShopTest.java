package tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest extends TestSetup {

    @Test
    public void hasName(){
        assertEquals("Ray's Music Store", shop1.getName());
        assertEquals("Simon's Music Store", shop2.getName());

    }

    @Test
    public void hasTill(){
        assertEquals(100000,shop1.getTill(),0.01);
        assertEquals(100000,shop2.getTill(),0.01);
    }

    @Test
    public void hasNoStockAtStart(){
        assertEquals(0, shop1.countStock());
        assertEquals(0, shop2.countStock());

    }

    @Test
    public void canAddStock(){
        shop1.addStock(guitar3);
        shop1.addStock(guitar4);
        shop1.addStock(ksynth2);
        shop1.addStock(drum1);
        assertEquals(4, shop1.countStock());

        shop2.addStock(guitar1);
        shop2.addStock(guitar2);
        shop2.addStock(ksynth1);
        shop2.addStock(drum2);
        assertEquals(4, shop2.countStock());
    }

    @Test
    public void canRemoveStock(){
        shop1.addStock(guitar1);
        shop1.addStock(guitar2);
        shop1.addStock(ksynth3);
        shop1.addStock(drum1);
        shop1.removeStock(guitar2);
        shop1.removeStock(drum1);
        shop1.removeStock(ksynth3);
        assertEquals(1, shop1.countStock());

        shop2.addStock(ksynth3);
        shop2.addStock(guitar4);
        shop2.addStock(drum3);
        shop2.addStock(ksynth2);
        shop2.removeStock(guitar4);
        assertEquals(3, shop2.countStock());
    }

    @Test
    public void canClearStock(){
        shop1.addStock(guitar3);
        shop1.addStock(guitar4);
        shop1.addStock(ksynth2);
        shop1.addStock(ksynth4);
        shop1.addStock(drum1);
        shop1.addStock(drum2);
        shop1.clearStock();
        assertEquals(0, shop1.countStock());

        shop2.addStock(guitar1);
        shop2.addStock(guitar2);
        shop2.addStock(ksynth1);
        shop2.addStock(ksynth3);
        shop1.addStock(drum1);
        shop1.addStock(drum2);
        shop2.clearStock();
        assertEquals(0, shop2.countStock());
    }

    @Test
    public void canGetStoreTotalMargin(){
        shop1.addStock(guitar2);
        shop1.addStock(ksynth4);
        shop1.addStock(drum3);
        assertEquals(900.00,shop1.calculateTotalMargin(), 0.01);

        shop2.addStock(guitar1);
        shop2.addStock(ksynth1);
        shop2.addStock(drum4);
        assertEquals(750.00,shop2.calculateTotalMargin(), 0.01);
    }

    @Test
    public void canReceivePayment(){
        shop1.receivePayment(900.00);
        assertEquals(100900.00, shop1.getTill(),0.01);

        shop2.receivePayment(900.00);
        assertEquals(100900.00, shop2.getTill(),0.01);
    }

    @Test
    public void canMakePayment(){
        shop1.makePayment(450.00);
        assertEquals(99550.00, shop1.getTill(), 0.01);

        shop2.makePayment(450.00);
        assertEquals(99550.00, shop2.getTill(), 0.01);
    }

    @Test
    public void canBuyGuitar(){
        shop1.addStock(guitar1);
        shop1.makePayment(guitar1.getBuyPrice());
        assertEquals(99550.00, shop1.getTill(),0.01);

        shop2.addStock(guitar1);
        shop2.makePayment(guitar1.getBuyPrice());
        assertEquals(99550.00, shop2.getTill(),0.01);
    }

    @Test
    public void canBuyKsynth(){
        shop1.addStock(ksynth1);
        shop1.makePayment(ksynth1.getBuyPrice());
        assertEquals(99800.00, shop1.getTill(),0.01);

        shop2.addStock(ksynth1);
        shop2.makePayment(ksynth1.getBuyPrice());
        assertEquals(99800.00, shop2.getTill(),0.01);
    }

    @Test
    public void shopsCanSellAndCustomersCanBuyGuitarsKSynthsAndDrums(){

        shop1.addStock(ksynth3);
        shop1.addStock(drum1);
        assertEquals(300.00, shop1.calculateTotalMargin(), 0.01);
        shop1.addCustomer(customer2);
        assertEquals(1, shop1.countCustomers());
        shop1.removeStock(ksynth3);
        shop1.removeStock(drum1);
        assertEquals(0, shop1.countStock());
        shop1.receivePayment(ksynth3.getSellPrice());
        shop1.receivePayment(drum1.getSellPrice());
        assertEquals(100600.00, shop1.getTill(),0.01);
        customer2.payForItem(600.00);
        assertEquals(99400.00, customer2.getWallet(),0.01);
        customer2.addItem(ksynth3);
        customer2.addItem(drum1);
        assertEquals(2, customer2.countPurchases());

        shop2.addStock(guitar1);
        assertEquals(450, shop2.calculateTotalMargin(),0.01);
        shop2.addCustomer(customer1);
        assertEquals(1, shop2.countCustomers());
        shop2.removeStock(guitar1);
        assertEquals(0,shop2.countStock());
        shop2.receivePayment(guitar1.getSellPrice());
        assertEquals(100900.00, shop2.getTill(),0.01);
        customer1.payForItem(900.00);
        assertEquals(99100.00, customer1.getWallet(),0.01);
        customer1.addItem(guitar1);
        assertEquals(1, customer1.countPurchases());
    }

    @Test
    public void customersStartAt0(){
        assertEquals(0, shop1.countCustomers());
    }

    @Test
    public void canAddCustomer(){
        shop2.addCustomer(customer1);
        assertEquals(1, shop2.countCustomers());
    }



}
