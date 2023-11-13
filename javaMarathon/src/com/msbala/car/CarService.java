package com.msbala.car;

public class CarService {

    private CarDAO carDAO;
    public CarService(){
        this.carDAO = new CarDAO();
    }
    public int registerNewCar(Car car){
        //check if car in not null
        //check if reg number is valid
        //check if reg number not taken
        //if price is < 0
        carDAO.saveCar(car);
        return 1;
    }

    public Car[] getCars(){
        return  carDAO.selectAllCars();
    }
}
