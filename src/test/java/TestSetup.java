import instruments.Guitar;
import instruments.ISell;
import instruments.InstrumentType;
import org.junit.Before;
import shop.Shop;

import java.util.ArrayList;

public class TestSetup {
    protected Guitar guitar1,guitar2, guitar3, guitar4;
    protected Shop shop1, shop2;
    protected ArrayList<ISell> stock1, stock2;

    @Before
    public void setUp(){
        stock1 = new ArrayList<ISell>();
        stock2 = new ArrayList<ISell>();
        shop1 = new Shop("Ray's Music Store",100000.00, stock1);
        shop2 = new Shop("Simon's Music Store",100000.00, stock2);

        guitar1 = new Guitar(
                "Fender",
                "Stratocaster",
                "Electric",
                6,
                "Mahogany",
                "Blue",
                450.00,
                900.00,
                InstrumentType.STRINGS);
        guitar2 = new Guitar(
                "Gibson",
                "Les Paul",
                "Electric",
                6,
                "Teak",
                "Tobacco",
                600.00,
                1200.00,
                InstrumentType.STRINGS);

        guitar3 = new Guitar(
                "Fender",
                "Stratocaster",
                "Electric",
                6,
                "Mahogany",
                "Blue",
                450.00,
                900.00,
                InstrumentType.STRINGS);
        guitar4 = new Guitar(
                "Gibson",
                "Les Paul",
                "Electric",
                6,
                "Teak",
                "Tobacco",
                600.00,
                1200.00,
                InstrumentType.STRINGS);

    }
}
