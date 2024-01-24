public class Car extends Vehicle{
    private String type;
    private int maxSpeed;
    Car(String manufacturer, String model, int year, String type) {
        super(manufacturer, model, year);
        this.type = type;
    }
    void Move(int distance) {
        System.out.println("Car moved - drove " + distance + " miles");
    }
}

