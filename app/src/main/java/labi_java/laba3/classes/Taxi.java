package labi_java.laba3.classes;

public class Taxi extends Transport {
    boolean premiumClass;

    public Taxi(int time, int price, boolean premiumClass) {
        super(time, price);
        this.premiumClass = premiumClass;
    }

    public int driveCost(int passengers) {
        if (passengers < 1) throw new IllegalArgumentException("Number of passengers must be above zero!"); 
        if (passengers > 4) throw new IllegalArgumentException("Taxi can include only 4 passengers or less!");
        return (premiumClass) ? this.price * this.time * 100000 / passengers : this.time * this.price / passengers;
    }
}
