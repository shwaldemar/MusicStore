package tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomerTest extends TestSetup{

    @Test
    public void hasName(){
        assertEquals("Simon", customer1.getName());
    }

    @Test
    public void hasEmail(){
        assertEquals("myemail.com", customer1.getEmail());
    }

    @Test
    public void hasWallet(){
        assertEquals(100000,customer1.getWallet(),0.01);
    }

    @Test
    public void hasNoPurchasesAtStart(){
        assertEquals(0, customer1.countPurchases());
    }

    @Test
    public void canPayForItem(){
        customer1.payForItem(10000.00);
        assertEquals(90000,customer1.getWallet(), 0.01);
    }

    @Test
    public void canAddPurchase(){
        customer1.addItem(guitar1);
        assertEquals(1, customer1.countPurchases());
    }

    @Test
    public void customerCanBuyAndShopCanSellAllItems(){
        shop2.addStock(guitar1);
        shop2.addStock(drum2);
        shop2.addStock(ksynth4);
        assertEquals(3, shop2.countStock());

        shop2.addCustomer(customer1);
        assertEquals(1, shop2.countCustomers());

        assertEquals("Twang Taaaaaaawang!", guitar1.play());
        assertEquals("KaBoom!", drum2.play());
        assertEquals("It's the sound of AxelF and the 80ies", ksynth4.play());

        shop2.removeStock(guitar1);
        shop2.removeStock(drum2);
        shop2.removeStock(ksynth4);
        assertEquals(0,shop2.countStock());

        shop2.receivePayment(guitar1.getSellPrice());
        shop2.receivePayment(drum2.getSellPrice());
        shop2.receivePayment(ksynth4.getBuyPrice());
        assertEquals(101300.00, shop2.getTill(),0.01);

        customer1.payForItem(1600.00);
        assertEquals(98400.00, customer1.getWallet(),0.01);

        customer1.addItem(guitar1);
        customer1.addItem(drum2);
        customer1.addItem(ksynth4);
        assertEquals(3, customer1.countPurchases());
    }
}
