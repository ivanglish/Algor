package com.algos;

public class NisumTest2 {
	
public static void main(String[] args) {
        
        Car car1 = new Car();
        Car car2 = new Car();
        car1.name = "car1";
        car2.name = "car2";
        
        
        switchCars(car1, car2);
        System.out.println(car1.name.equals(car2.name));
    }
    
    
    public static void switchCars(Car car1, Car car2){
        
        car1.name=car2.name;
        System.out.println(car1.name.equals(car2.name));
    }

}


