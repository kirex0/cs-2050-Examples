public class Vehicle {

    private String manufacturer;
    private String model;
    private int year;

    Vehicle(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    void Move(int distance) {
        System.out.println("Moved " + distance + " miles");
    }
}
