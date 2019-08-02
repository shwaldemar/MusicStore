package tests;

import instruments.Guitar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest extends TestSetup {

    @Test
    public void canCalculateMarkUp(){
        Assert.assertEquals(450.00, guitar1.calculateMarkUp(), 0.01);
    }

    @Test
    public void canPlay(){
        Assert.assertEquals("Twang Taaaaaaawang!", guitar2.play());
    }

    @Test
    public void hasMake(){
        Assert.assertEquals("Fender", guitar1.getMake());
    }

    @Test
    public void hasModel(){
        Assert.assertEquals("Stratocaster", guitar1.getModel());
    }

    @Test
    public void hasMaterial(){
        Assert.assertEquals("Blue", guitar1.getColour());
    }

    @Test
    public void hasGuitarType(){
        Assert.assertEquals("Electric", guitar2.getGuitarType());
    }

    @Test
    public void hasBuyPrice(){
        Assert.assertEquals(450.00, guitar1.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        Assert.assertEquals(900.00, guitar1.getSellPrice(), 0.01);
    }

}

