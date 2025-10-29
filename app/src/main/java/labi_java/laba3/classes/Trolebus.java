package labi_java.laba3.classes;

public class Trolebus extends Transport{
    int places;

    public Trolebus(int time, int price, int places) {
        super(time, price);
        this.places = places;
    }

    public int driveCost(int passengers) {
        if (passengers < 1) throw new IllegalArgumentException("Number of passengers must be above zero!"); 
        return this.price / this.places * passengers;
    }
}
