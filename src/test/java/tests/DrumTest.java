package tests;

import instruments.InstrumentType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest extends TestSetup{


    @Test
    public void canCalculateMarkUp(){
        assertEquals(100, drum1.calculateMarkUp(),0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("KaBoom!", drum1.play());
    }

    @Test
    public void hasMake(){
        assertEquals("Bongo", drum1.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Snare", drum2.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("Metallic Grey", drum3.getColour());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(100.00, drum4.getBuyPrice(),0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(200.00, drum1.getSellPrice(),0.01);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Steel", drum4.getMaterial());
    }

    @Test
    public void hasDrumType(){
        assertEquals("OOooooo it's a type of boomy bangy thingy", drum3.getDrumType());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.PERCUSSION, drum4.getType());
    }

    @Test
    public void hasSize(){
        assertEquals(60, drum3.getSize());
    }



}



//    InstrumentType type,
//    int size
