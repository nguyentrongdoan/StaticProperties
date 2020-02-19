package com.codegyme;

public class TestStaticProperty {
    public static void main(String[] args) {
//        Car car1 = new Car("mazda 3", "Skyactiv 3");
//        System.out.println(Car.numberOfCars);

        Car car2 = new Car("mazda 6", "Skyactiv 6");
        System.out.println(Car.numberOfCars);

        Car car3 = new Car("Civic", "Skyactiv");
        System.out.println(Car.numberOfCars);
    }
}
