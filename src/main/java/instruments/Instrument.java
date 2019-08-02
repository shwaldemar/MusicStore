package instruments;

public class Instrument {
    private String make;
    private String material;
    private String colour;
    private Double buyPrice;
    private Double sellPrice;
    private InstrumentType type;

    public Instrument(String make, String material, String colour, Double buyPrice, Double sellPrice, InstrumentType type) {
        this.make = make;
        this.material = material;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public InstrumentType getType() {
        return type;
    }
}
