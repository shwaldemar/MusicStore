package instruments;

public class Guitar extends Instrument implements IPlay, ISell{

    private String model;
    private String guitarType;
    private int numStrings;

    public Guitar(
            String make,
            String model,
            String guitarType,
            int numStrings,
            String material,
            String colour,
            Double buyPrice,
            Double sellPrice,
            InstrumentType type
    )
    {
        super(make, material, colour, buyPrice, sellPrice, type);
        this.model = model;
        this.guitarType = guitarType;
        this.numStrings = numStrings;
    }

    public Double calculateMarkUp(){
        return (getSellPrice() - getBuyPrice());
    }

    public String play(){
        return "Twang Taaaaaaawang!";
    }

    public String getModel() {
        return model;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public int getNumStrings() {
        return numStrings;
    }
}
