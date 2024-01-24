public class Tank extends Vehicle {
    private int gunDiameter;

    Tank(String manufacturer, String model, int year, int caliber) {
        super(manufacturer, model, year);
        this.gunDiameter = caliber;
    }

    void Move(int distance) {
        System.out.println("Tank Rumbled - blasting " + distance + " miles");
    }
}
