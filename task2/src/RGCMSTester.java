public class RGCMSTester {
    public static void main(String[] args) {
        RGCMS rgcms = new RGCMS();

        Car car1 = new Car("Speedster", "Apex Motors", 250.0, 5.2);
        Car car2 = new Car("Turbo Racer", "Zoomtech Inc.", 280.0, 4.8);
        Car car3 = new Car("Sonic Bullet", "Apex Motors", 320.0, 3.9);

        rgcms.addCar(car1);
        rgcms.addCar(car2);
        rgcms.addCar(car3);

        rgcms.displayCars();

        rgcms.removeCar(car2);

        System.out.println("\nAfter removing a car:");
        rgcms.displayCars();
    }
}