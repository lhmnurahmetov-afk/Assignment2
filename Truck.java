public class Truck extends Vehicle {

    private double capacity; // грузоподъемность в тоннах
    private int numAxles;    // количество осей

    public Truck(String brand, int year, double capacity, int numAxles) {
        super(brand, year); // вызов конструктора родительского класса
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " truck engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " truck engine stopped.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // вызов метода родителя
        System.out.println("Capacity: " + capacity + " tons");
        System.out.println("Number of Axles: " + numAxles);
    }
}
