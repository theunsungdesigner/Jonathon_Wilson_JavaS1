public class ComputerMouse {
    private String manufacturer;
    private String model;
    private int xPosition;
    private int yPosition;
    private int[] lastClickedLocation;

    public ComputerMouse(String manufacturer, String model, int xPosition, int yPosition, int[] lastClickedLocation) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.lastClickedLocation = lastClickedLocation;

    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
}
