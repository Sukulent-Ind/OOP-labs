package labi_java.laba3.classes;

public class Bus extends Transport {
    int places;

    public Bus(int time, int price, int places) {
        super(time, price);
        this.places = places;
    }

    public int driveCost(int passengers) {
        if (passengers < 1) throw new IllegalArgumentException("Number of passengers must be above zero!"); 
        return this.time * this.price / this.places * passengers;
    }
}
