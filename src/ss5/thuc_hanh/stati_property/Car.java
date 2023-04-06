package ss5.thuc_hanh.stati_property;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;


    public Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }

    public String getName(){
        return this.name;
    }

    public String getEngine(){
        return this.engine;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }
}

