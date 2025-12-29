public class Car extends Vehicle {

    private int doors;
    private String fuelType;

    public Car(String brand, int year, int doors, String fuelType) {
        super(brand, year); // вызов конструктора родительского класса
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " engine stopped.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // вызов метода родителя
        System.out.println("Doors: " + doors);
        System.out.println("Fuel Type: " + fuelType);
    }
}
