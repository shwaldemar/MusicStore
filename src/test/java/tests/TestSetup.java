package tests;

import customers.Customer;
import customers.IBuy;
import instruments.*;
import org.junit.Before;
import shop.IShop;
import shop.Shop;

import java.util.ArrayList;

public class TestSetup {

    //Instruments
    protected Guitar guitar1,guitar2, guitar3, guitar4;
    protected KeyAndSynth ksynth1, ksynth2, ksynth3, ksynth4;
    protected Drum drum1, drum2, drum3, drum4;

    //Shops
    protected Shop shop1, shop2;
    protected ArrayList<ISell> stock1, stock2;

    //Customers
    protected Customer customer1, customer2;
    protected ArrayList<IBuy> purchases1, purchases2;

    //Shop ArrayLists of customers
    protected ArrayList<IShop> customers1, customers2;

    @Before
    public void setUp(){

        //Customer
        purchases1 = new ArrayList<IBuy>();
        purchases2 = new ArrayList<IBuy>();
        customer1 = new Customer("Simon", "myemail.com", 100000.00, purchases1);
        customer2 = new Customer("Mongo", "myemail.com", 100000.00, purchases2);

        //Shop
        shop1 = new Shop("Ray's Music Store",100000.00, stock1, customers1);
        shop2 = new Shop("Simon's Music Store",100000.00, stock2,customers2);
        stock1 = new ArrayList<ISell>();
        stock2 = new ArrayList<ISell>();
        customers1 = new ArrayList<IShop>();
        customers2 = new ArrayList<IShop>();

        //guitars
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


        //Keyboards & Synths
        ksynth1 = new KeyAndSynth(
                "Yamaha",
                "PSRF51",
                "Portable",
                61,
                "Carbon Fibre",
                "Rainbow",
                200.00,
                400.00,
                InstrumentType.KEYSANDSYNTHS);
        ksynth2 = new KeyAndSynth(
                "Yamaha",
                "Montage",
                "Portable",
                61,
                "Carbon Fibre",
                "Rainbow",
                200.00,
                400.00,
                InstrumentType.KEYSANDSYNTHS);
        ksynth3 = new KeyAndSynth(
                "Yamaha",
                "Modx",
                "Portable",
                61,
                "Carbon Fibre",
                "Rainbow",
                200.00,
                400.00,
                InstrumentType.KEYSANDSYNTHS);
        ksynth4 = new KeyAndSynth(
                "Yamaha",
                "Montage",
                "Portable",
                61,
                "Carbon Fibre",
                "Rainbow",
                200.00,
                400.00,
                InstrumentType.KEYSANDSYNTHS);

        //Drums
        drum1 = new Drum(
                "Bongo",
                "Banana",
                "Brown",
                100.00,
                200.00,
                InstrumentType.PERCUSSION,
                "The cool one",
                "OOooooo it's a type of thingy",
                10
        );

        drum2 = new Drum(
                "The Big Basher",
                "Steel",
                "Metallic Grey",
                100.00,
                200.00,
                InstrumentType.PERCUSSION,
                "Snare",
                "OOooooo it's a type of loud bangy thingy",
                25
        );

        drum3 = new Drum(
                "The Big Basher",
                "Steel",
                "Metallic Grey",
                100.00,
                200.00,
                InstrumentType.PERCUSSION,
                "Bass",
                "OOooooo it's a type of boomy bangy thingy",
                60
        );

        drum4 = new Drum(
                "The Big Basher",
                "Steel",
                "Metallic Grey",
                100.00,
                200.00,
                InstrumentType.PERCUSSION,
                "Tom Tom",
                "OOooooo it's a type of boomy bangy bangy thingy",
                40
        );
    }
}
