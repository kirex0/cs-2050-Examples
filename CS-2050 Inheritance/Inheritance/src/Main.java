import java.awt.*; //This includes Color, Color is not a predefined data type.

public class Main {
    public static void main(String[] args) {
        //Question 1: What is inheritance?

        Car cMine = new Car("Porsche", "911 GT3RS", 2023, "Coupe");
        Tank tMitsu = new Tank("Mitsubishi", "MHI-Type 10", 2022, 75);

        //You can create an array of Vehicle, it can hold any class that inherits from Vehicle!
        Vehicle[] vlist = {cMine, tMitsu};
        for (Vehicle v : vlist) v.Move(20);


        //Question 2: What is polymorphism?

        //Question 3: What is an abstract class?

        Penguin peng = new Penguin(Color.red, true);
        Eagle eag = new Eagle(Color.black, 3 );
        peng.makeSound();
        peng.onIce = false;
        peng.makeSound();


        //Question 4: Does the below code work? Why?
        //Bird b = new Bird();
        //Birb b.makeSound();

        //Question 5 Why does e.makeSound() and p.makeSound() have different outputs when this code runs?
        Bird[] birdList = {peng, eag};
        for (Bird b : birdList) { b.makeSound(); }
    }
}
