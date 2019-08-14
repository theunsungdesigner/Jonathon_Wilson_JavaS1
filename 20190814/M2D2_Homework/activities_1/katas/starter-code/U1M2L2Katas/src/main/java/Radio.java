public class Radio {
    private String manufacturer;
    private String model;
    private int numSpeakers;
    private String station;
    private int volume;
    private boolean powered;

    public Radio(String manufacturer, String model, int numSpeakers, String station, int volume, boolean powered) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.numSpeakers = numSpeakers;
        this.station = station;
        this.volume = volume;
        this.powered = powered;
    }
    public void togglePower() {
        this.powered = !powered;
    }
}
