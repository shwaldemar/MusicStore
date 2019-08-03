package tests;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest extends TestSetup {

    @Test
    public void canCalculateMarkUp(){
        assertEquals(450.00, guitar1.calculateMarkUp(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Twang Taaaaaaawang!", guitar2.play());
    }

    @Test
    public void hasMake(){
        assertEquals("Fender", guitar1.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Stratocaster", guitar1.getModel());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Blue", guitar1.getColour());
    }

    @Test
    public void hasGuitarType(){

        assertEquals("Electric", guitar2.getGuitarType());
    }

    @Test
    public void hasNumStrings(){
        assertEquals(6, guitar2.getNumStrings());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(450.00, guitar1.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(900.00, guitar1.getSellPrice(), 0.01);
    }

}

