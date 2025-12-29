public class Main {
    public static void main(String[] args) {

        Driver driver1 = new Driver("Alice", "DL12345");
        Driver driver2 = new Driver("Bob", "DL67890");

        Car car = new Car("Toyota", 2020, 4, "Petrol", driver1);
        Motorcycle bike = new Motorcycle("Harley-Davidson", 2019, true, driver2);
        Truck truck = new Truck("Volvo", 2022, 15.5, 4, driver1);

        Vehicle[] vehicles = {car, bike, truck};

        for (Vehicle v : vehicles) {
            System.out.println("=== Vehicle Info ===");
            v.startEngine();
            v.displayInfo();
            v.stopEngine();
            System.out.println();
        }
    }
}
