public class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year); // вызов конструктора родительского класса
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " motorcycle engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + " motorcycle engine stopped.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // вызов метода родителя
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}
