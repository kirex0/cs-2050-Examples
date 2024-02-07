import java.awt.*;

class Eagle extends Bird {
    int dailyFoodReq; // in pounds
    static int eagleID;
    void fly(int distance) {
// code to define how eagles fly;
        System.out.println("Eagle " + eagleID + ": Fly away " + distance + " meters");
    }
    void move(int distance) {
//System.out.println("Eagle " + eagleID + " will move");
        fly(distance);
    }
    void getDiet( ) { System.out.println( "Eagle " + eagleID + " Diet:small mammals, birds, garbage"); }
    int makeSound( ) { // code to make loud severe screech
        System.out.println("Eagle " + eagleID + ": Screech at 250 decibels");
        return 250;
    }
    public Eagle(Color col , int reqFood) {
        birdType = "Eagle"; weight = 12;
        featherColor = col; eagleID = birdID++;
        dailyFoodReq = reqFood;
    }
}