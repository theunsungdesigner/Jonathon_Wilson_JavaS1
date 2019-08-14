public class CoffeeMaker {
    private String manufacturer;
    private String model;
    private int carafeSize;
    private int cupsLeft;
    private boolean powered;

    public CoffeeMaker(String manufacturer, String model, int carafeSize, int cupsLeft, boolean powered) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.carafeSize = carafeSize;
        this.cupsLeft = cupsLeft;
        this.powered = powered;
    }
    public void brew() {
        if (isPowered()) {
            this.cupsLeft = getCarafeSize();
        }
    }

    public void pourCoffee(int numCups) {
        if (getCupsLeft() > numCups) {
            this.cupsLeft = getCupsLeft() - numCups;
        } else {
            this.cupsLeft = 0;
        }
    }
}
