import java.awt.*;

abstract class Bird {
    //data
    protected static int birdID;
    private int eggSize;
    protected String birdType;
    Color featherColor;
    int numEggsPerDay;
    int weight;

    //abstract methods
    abstract int makeSound();
    abstract void move(int distance);
    abstract void getDiet();

    //methods
    void setEggSize(int mms) {eggSize = mms;}
    int getEggSize() {return eggSize;}


}
