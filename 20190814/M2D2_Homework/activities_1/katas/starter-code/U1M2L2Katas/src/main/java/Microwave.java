public class Microwave {
    private String manufacturer;
    private String model;
    private int secondsLeft;
    private String time;
    private boolean running;

    public Microwave(String manufacturer, String model, int secondsLeft, String time, boolean running) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.secondsLeft = secondsLeft;
        this.time = time;
        this.running = running;
    }

    public void start(int secondsLeft) {
        this.secondsLeft = secondsLeft;
        this.running = true;
    }

    public void stop() {
        this.running = false;
    }

    public void clear() {
        this.secondsLeft = 0;
    }

}
