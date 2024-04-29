import java.util.ArrayList;
import java.util.List;

public class RGCMS {
    private List<Car> carCollection;

    public RGCMS() {
        carCollection = new ArrayList<>();
    }

    public void addCar(Car car) {
        carCollection.add(car);
    }

    public boolean removeCar(Car car) {
        return carCollection.remove(car);
    }

    public void displayCars() {
        if (carCollection.isEmpty()) {
            System.out.println("The car collection is empty.");
        } else {
            System.out.println("Cars in the collection:");
            for (Car car : carCollection) {
                System.out.println(car);
            }
        }
    }
}