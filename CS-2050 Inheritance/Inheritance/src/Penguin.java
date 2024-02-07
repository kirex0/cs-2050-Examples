import java.awt.*;  //this includes Color

public class Penguin extends Bird{

    boolean onIce = true;
    int ID;
    int peep = 20;
    public Penguin(Color col, boolean onice){
        birdType = "Penguin";
        weight = 2;
        onIce = onice;
        featherColor = col;
        ID = birdID++;
    }
    void waddle(int distance){
        System.out.println("Penguin " + ID + ": Waddled Away" + distance + " meters");
    }
    void swim(int distance){
        System.out.println("Penguin " + ID + ": Swam Away" + distance + " meters");

    }
    int makeSound() {
        System.out.println("Penguin " + ID + ": peeped at " + peep + " decibels");
        return peep;
    }

    void move(int distance) {
        if( onIce == true){
            waddle(distance);
        }
        else {
            waddle(distance);
        }
    }

    void getDiet() {
    System.out.println("Penguin " + ID + ": Diet: fish, crustaceans");
    }
}
