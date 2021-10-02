package model;

import java.util.ArrayList;
import java.util.Locale;

public class CarModel {
    private ArrayList<Car> carTypes = new ArrayList<>();

    public CarModel(){
        carTypes.add(new Car( "SUV", "Santa Fe", 2017));
        carTypes.add(new Car( "Sedan", "Santa Fe", 2016));
        carTypes.add(new Car( "Hatch-bag", "Santa Fe", 2015));
    }

    public Car getCarByType (String type){
        Car car = null;

        for (Car c : carTypes){
            if(c.getType().toLowerCase().equals(type.toLowerCase())){
                return c;
            }
        }
        return car;
    }
}
