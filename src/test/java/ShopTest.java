import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest extends TestSetup {

    @Test
    public void hasName(){
        assertEquals("Simon's Music Store", shop2.getName());
    }

    @Test
    public void hasNoStockAtStart(){
        assertEquals(0, shop2.countStock());
    }

    @Test
    public void canAddStock(){
        shop2.addStock(guitar1);
        shop2.addStock(guitar2);
        assertEquals(2, shop2.countStock());
    }

    @Test
    public void canRemoveStock(){
        shop1.addStock(guitar3);
        shop1.addStock(guitar4);
        shop1.removeStock(guitar3);
        assertEquals(1, shop1.countStock());
    }

}
