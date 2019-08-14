package com.company;

public class App {

    public static void main(String[] args) {
        TV createTV = new TV("Zenith", "U2121H", 83, "NBC", 55, false);

            createTV.getManufacturer();
            createTV.getModel();
            createTV.getChannel();
            createTV.getScreenSize();
            createTV.getVolume();
            createTV.isPowered();


        Radio createRadio = new Radio("Sony", "V32", - 2, "WUNV",30,  true);

            createRadio.getModel();
            createRadio.getManufacturer();
            createRadio.getNumSpeakers();
            createRadio.getStation();
            createRadio.getVolume();
            createRadio.isPowered();

       Microwave createMicrowave = new Microwave("Haier", "X1200w", - 45, "12:00", false);

            createMicrowave.getManufacturer();
            createMicrowave.getModel();
            createMicrowave.getSecondsLeft();
            createMicrowave.getTime();
            createMicrowave.isRunning();

       CoffeeMaker createCoffeeMaker = new CoffeeMaker("Sunbeam", "C12", 12,8, true);

        createCoffeeMaker.getManufacturer();
        createCoffeeMaker.getModel();
        createCoffeeMaker.getCarafeSize();
        createCoffeeMaker.getCupsLeft();
        createCoffeeMaker.isPowered();

       Car createCar = new Car("Honda", "Accord", "Sedan", "Blue", "2.6L V6","CVT",4,31.7,   25218
       );

       createCar.getMake();
       createCar.getModel();
       createCar.getType();
       createCar.getColor();
       createCar.getEngine();
       createCar.getTransmission();
       createCar.getNumDoors();
       createCar.getMpg();
       createCar.getMilesDriven();

       ComputerMouse createComputerMouse = new ComputerMouse("Razer", "Naga", 960, 540, [0,0]);
        createComputerMouse.getManufacturer();
        createComputerMouse.getModel();
        createComputerMouse.getxPosition();
        createComputerMouse.getyPosition();
        createComputerMouse.getLastClickedLocation();
    }
}

