package labi_java.laba3.classes;

public class Airplane extends Transport{
    boolean buisnessClass;

    public Airplane(int time, int price, boolean buisnessClass) {
        super(time, price);
        this.buisnessClass = buisnessClass;
    }

    @Override
    public int driveCost(int passengers) {
        if (passengers < 1) throw new IllegalArgumentException("Number of passengers must be above zero!"); 
        return (buisnessClass) ? 2000 * this.time * this.price / passengers : 10 * this.time * this.price / passengers;
    }
}
