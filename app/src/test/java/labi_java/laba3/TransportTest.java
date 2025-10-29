package labi_java.laba3;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import labi_java.laba3.classes.*;

public class TransportTest {
    
    @ParameterizedTest
    @ValueSource(ints = {23, 12, 5, 34})
    void testAirplaneCost(int passengers) {
        //Arrange
        int time = 1000;
        int price = 13500;
        boolean buisnessClass = false;
        Airplane airplane = new Airplane(time, price, buisnessClass);
        int guessCost = 10 * time * price / passengers;

        //Act
        int driveCost = airplane.driveCost(passengers);

        //Assert
        assertTrue(driveCost == guessCost);

    }

    @ParameterizedTest
    @ValueSource(ints = {23, 12, 52, 34})
    void testAirplaneBuisnessCost(int passengers) {
        //Arrange
        int time = 1000;
        int price = 13500;
        boolean buisnessClass = true;
        Airplane airplane = new Airplane(time, price, buisnessClass);
        int guessCost = 2000 * time * price / passengers;

        //Act
        int driveCost = airplane.driveCost(passengers);

        //Assert
        assertTrue(driveCost == guessCost);
        
    }

    @Test
    void testAirplaneIncorPassengers() {
        //Arrange
        int passengers = 0;
        int time = 1000;
        int price = 13500;
        boolean buisnessClass = false;
        Airplane airplane = new Airplane(time, price, buisnessClass);

        //Act
        //Assert
        assertThrows(IllegalArgumentException.class, () -> {airplane.driveCost(passengers);});
        
    }

    @ParameterizedTest
    @ValueSource(ints = {23, 12, 5, 34})
    void testBusCost(int passengers) {
        //Arrange
        int time = 200;
        int price = 13500;
        int places = 20;
        Bus bus = new Bus(time, price, places);
        int guessCost = time * price / places * passengers;

        //Act
        int driveCost = bus.driveCost(passengers);

        //Assert
        assertTrue(driveCost == guessCost);
        
    }

    @Test
    void testBusIncorPassengers() {
        //Arrange
        int time = 200;
        int price = 13500;
        int places = 20;
        int passengers = 0;
        Bus bus = new Bus(time, price, places);

        //Act
        //Assert
        assertThrows(IllegalArgumentException.class, () -> {bus.driveCost(passengers);});
        
    }

    @ParameterizedTest
    @ValueSource(ints = {223, 12, 15, 34})
    void testTrolebusCost(int passengers) {
        //Arrange
        int time = 200;
        int price = 13500;
        int places = 20;
        Trolebus trolebus = new Trolebus(time, price, places);
        int guessCost = price / places * passengers;

        //Act
        int driveCost = trolebus.driveCost(passengers);

        //Assert
        assertTrue(driveCost == guessCost);

    }
    
    @Test
    void testTrolebusIncorPassengers() {
        //Arrange
        int time = 200;
        int price = 13500;
        int places = 20;
        int passengers = 0;
        Trolebus trolebus = new Trolebus(time, price, places);

        //Act
        //Assert
        assertThrows(IllegalArgumentException.class, () -> {trolebus.driveCost(passengers);});
        
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void testTaxiCost(int passengers) {
        //Arrange
        int time = 1700;
        int price = 50;
        boolean premiumClass = false;
        Taxi taxi = new Taxi(time, price, premiumClass);
        int guessCost = time * price / passengers;

        //Act
        int driveCost = taxi.driveCost(passengers);

        //Assert
        assertTrue(driveCost == guessCost);
        
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void testTaxiPremiumCost(int passengers) {
        //Arrange
        int time = 1700;
        int price = 50;
        boolean premiumClass = true;
        Taxi taxi = new Taxi(time, price, premiumClass);
        int guessCost = time * price * 100000 / passengers;
        //Act
        int driveCost = taxi.driveCost(passengers);

        //Assert
        assertTrue(driveCost == guessCost);
        
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 7})
    void testTaxiIncorPassengers(int passengers) {
        //Arrange
        int time = 1700;
        int price = 50;
        boolean premiumClass = true;
        Taxi taxi = new Taxi(time, price, premiumClass);

        //Act
        //Assert
        assertThrows(IllegalArgumentException.class, () -> {taxi.driveCost(passengers);});

    }

}

