package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService{

    private List <Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Kia",1, "red"));
        cars.add(new Car("Hyundai",2, "black"));
        cars.add(new Car("Nissan",3, "white"));
        cars.add(new Car("Geely",4, "silver"));
        cars.add(new Car("Opel",5, "grey"));
    }

    @Override
    public List <Car> cars(Integer count){
        return cars.stream().limit(count).collect(Collectors.toList());

    }

    @Override
    public List<Car> index() {
        return cars;
    }
}
