package tests;

import org.junit.Assert;
import org.junit.Test;

public class KeyAndSynthTest extends TestSetup {

    @Test
    public void canCalculateMarkUp(){
        Assert.assertEquals(200.00, ksynth1.calculateMarkUp(), 0.01);
    }

    @Test
    public void canPlay(){
        Assert.assertEquals("It's the sound of AxelF and the 80ies", ksynth2.play());
    }

    @Test
    public void hasMake(){
        Assert.assertEquals("Yamaha", ksynth1.getMake());
    }

    @Test
    public void hasModel(){
        Assert.assertEquals("PSRF51", ksynth1.getModel());
    }

    @Test
    public void hasMaterial(){
        Assert.assertEquals("Rainbow", ksynth4.getColour());
    }

    @Test
    public void hasKeyAndSynthType(){
        Assert.assertEquals("Portable", ksynth1.getKeyType());
    }

    @Test
    public void hasBuyPrice(){
        Assert.assertEquals(200.00, ksynth3.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        Assert.assertEquals(400.00, ksynth4.getSellPrice(), 0.01);
    }

}
