package tests;

import org.junit.Test;
import tests.TestSetup;

import static org.junit.Assert.assertEquals;

public class ShopTest extends TestSetup {

    @Test
    public void hasName(){
        assertEquals("Simon's Music Store", shop2.getName());
    }

    @Test
    public void hasTill(){
        assertEquals(100000,shop1.getTill(),0.01);
    }

    @Test
    public void hasNoStockAtStart(){
        assertEquals(0, shop2.countStock());
    }

    @Test
    public void canAddStock(){
        shop2.addStock(guitar1);
        shop2.addStock(guitar2);
        shop2.addStock(ksynth1);
        shop2.addStock(ksynth2);

        assertEquals(4, shop2.countStock());
    }

    @Test
    public void canRemoveStock(){
        shop1.addStock(guitar3);
        shop1.addStock(guitar4);
        shop1.removeStock(guitar3);
        assertEquals(1, shop1.countStock());
    }

    @Test
    public void canClearStock(){
        shop2.addStock(guitar1);
        shop2.addStock(guitar2);
        shop2.addStock(guitar3);
        shop2.addStock(guitar4);
        shop2.clearStock();
        assertEquals(0, shop2.countStock());
    }

    @Test
    public void canGetStoreTotalMargin(){
        shop2.addStock(guitar1);
        shop2.addStock(guitar3);
        assertEquals(900,shop2.calculateTotalMargin(), 0.01);
    }


}
