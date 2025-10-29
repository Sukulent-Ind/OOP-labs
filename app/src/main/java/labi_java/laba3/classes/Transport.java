package labi_java.laba3.classes;

abstract class Transport {

    int price; // цена билета
    int time; // время поездки


    Transport(int time, int price) {
        this.time = time;
        this.price = price;
    }

    abstract int driveCost(int passengers);
}