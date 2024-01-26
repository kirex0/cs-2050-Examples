public class Main {
    public static void main(String[] args) {
        //Question 1: What is inheritance?

    Car cMine = new Car("Porsche", "911 GT3RS", 2023, "Coupe");
    Tank tMitsu = new Tank("Mitsubishi", "MHI-Type 10", 2022, 75);

    Vehicle [] vlist = {cMine, tMitsu};
    for (Vehicle v : vlist) v.Move(20);

        //File In Progress!

    }
}
