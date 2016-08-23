package com.algos;

public class NisumTest {
    
    public static void main(String[] args) {
        
        Car car1 = new Car();
        Car car2 = new Car();
        switchCars(car1, car2);
        System.out.println(car1.equals(car2));
    }
    
    
    public static void switchCars(Car car1, Car car2){
        
        car1=car2;
        System.out.println(">"+car1.equals(car2));
    }

}

