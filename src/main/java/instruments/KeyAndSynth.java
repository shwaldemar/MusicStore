package instruments;

import customers.IBuy;

public class KeyAndSynth extends Instrument implements IPlay, ISell, IBuy {

    private String model;
    private String keyType;
    private int numKeys;

    public KeyAndSynth(
            String make,
            String model,
            String keyType,
            int numKeys,
            String material,
            String colour,
            Double buyPrice,
            Double sellPrice,
            InstrumentType type
    )
    {
        super(make, material, colour, buyPrice, sellPrice, type);
        this.model = model;
        this.keyType = keyType;
        this.numKeys = numKeys;
    }

    public Double calculateMarkUp(){
        return (getSellPrice() - getBuyPrice());
    }

    public String play(){
        return "It's the sound of AxelF and the 80ies";
    }

    public String getModel() {
        return model;
    }

    public String getKeyType() {
        return keyType;
    }

    public int getNumKeys() {
        return numKeys;
    }

}
