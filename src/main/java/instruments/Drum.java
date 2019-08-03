package instruments;

import customers.IBuy;

public class Drum extends Instrument implements IPlay, ISell, IBuy {

    private String model;
    private String drumType;
    private int size;

    public Drum(
            String make,
            String material,
            String colour,
            Double buyPrice,
            Double sellPrice,
            InstrumentType type,
            String model,
            String drumType,
            int size
    )
    {
        super(make, material, colour, buyPrice, sellPrice, type);
        this.model = model;
        this.drumType = drumType;
        this.size = size;
    }

    public Double calculateMarkUp(){
        return (getSellPrice() - getBuyPrice());
    }

    public String play(){
        return "KaBoom!";
    }

    public String getModel() {
        return model;
    }

    public String getDrumType() {
        return drumType;
    }

    public int getSize() {
        return size;
    }
}

