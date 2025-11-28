package labi_java.laba3.classes;

public abstract class Transport {

    protected int price; // цена билета
    protected int time; // время поездки


    protected Transport(int time, int price) {
        this.time = time;
        this.price = price;
    }

    public abstract int driveCost(int passengers);
}