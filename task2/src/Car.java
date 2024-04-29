public class Car {
    private String name;
    private String manufacturer;
    private double topSpeed;
    private double acceleration;

    public Car(String name, String manufacturer, double topSpeed, double acceleration) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", topSpeed=" + topSpeed +
                ", acceleration=" + acceleration +
                '}';
    }
}