import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;

public class TestSetup {
    protected Guitar guitar1,guitar2;

    @Before
    public void setUp(){
        guitar1 = new Guitar("Fender", "Stratocaster",
                "Electric",
                6,
                "Mahogany",
                "Blue",
                450.00,
                900.00,
                InstrumentType.STRINGS);
        guitar2 = new Guitar("Gibson", "Les Paul",
                "Electric",
                6,
                "Teak",
                "Tobacco",
                600.00,
                1200.00,
                InstrumentType.STRINGS);
    }
}
