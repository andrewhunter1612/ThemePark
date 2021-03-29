package attractions;

public enum PriceType {
    ROLLERCOASTER(8.4),
    DODGEMS(4.5);

    private final double price;

    PriceType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
