package com.newfeatures;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class VehicleConsumer {
    public static void main(String[] args) {
        Vehicle[] v = {new Vehicle(300, "Sports Car"),
                new Vehicle(220, "Car"),
                new Vehicle(180, "Bike"),
                new Vehicle(120, "Truck"),
                new Vehicle(80, "Bicycle")
        };
        Function<Vehicle, String> function = v1 -> {
            String speedType;
            int topSpeed = v1.topSpeed;
            if (topSpeed >= 230) {
                speedType = "Very Very Fast";
            }
            else if (topSpeed >= 190) {
                speedType = "Very Fast";
            }
            else if (topSpeed >= 130) {
                speedType = "Fast";
            }
            else if (topSpeed >= 90) {
                speedType = "Slow";
            }
            else {
                speedType = "Very slow";
            }
            return speedType;
        };
        Predicate<Vehicle> predicate = v1 -> v1.topSpeed >= 130;
        Consumer<Vehicle> consumer = v1 -> {
            System.out.println("Vehicle Speed:" + v1.topSpeed);
            System.out.println("Vehicle Type:" + v1.type);
            System.out.println("Vehicle Speed Type:" + function.apply(v1));
            System.out.println();
        };
        for (Vehicle v2 : v) {
            if(predicate.test(v2)) {
                consumer.accept(v2);
        }
        }
    }
}
class Vehicle {
    int topSpeed;
    String type;
    Vehicle(int topSpeed, String type) {
        this.topSpeed = topSpeed;
        this.type = type;
    }
}
