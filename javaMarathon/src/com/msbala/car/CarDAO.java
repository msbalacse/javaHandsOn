package com.msbala.car;

public class CarDAO {
    private static Car[] cars;

    private  static int nextAvailableSlot = 0;


    public static final int CAPACITY = 5;

    static {
        cars = new Car[CAPACITY];
    }

    public void saveCar(Car car){
        if(nextAvailableSlot+1 >= CAPACITY){
            // grow db
        }
        cars[nextAvailableSlot] = car;
        ++nextAvailableSlot;
    }

    public Car[] selectAllCars(){
        return cars;
    }
}
