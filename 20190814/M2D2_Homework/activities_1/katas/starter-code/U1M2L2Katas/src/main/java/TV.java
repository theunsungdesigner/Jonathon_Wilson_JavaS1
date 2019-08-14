public class TV {
    private String manufacturer;
    private String model;
    private int screenSize;
    private String channel;
    private int volume;
    private boolean powered;

    public TV(String manufacturer, String model, int screenSize, String channel, int volume, boolean powered) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.screenSize = screenSize;
        this.channel = channel;
        this.volume = volume;
        this.powered = powered;

    }
    public void togglePower() {
        this.powered = !powered;
    }

}