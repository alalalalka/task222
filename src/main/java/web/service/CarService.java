package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    public List <Car> cars(Integer count);

    public List<Car> index();

}
